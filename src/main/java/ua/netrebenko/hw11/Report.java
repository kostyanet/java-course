package ua.netrebenko.hw11;

import ua.netrebenko.hw10.AbstractReport;

import java.util.Objects;

public class Report extends AbstractReport {
    private String body;

    private Report(String header, String body, String footer) {
        super(header, footer);
        this.body = body;
    }

    public static ReportBuilder builder() {
        return new ReportBuilder();
    }

    public ReportBuilder toBuilder() {
        return new ReportBuilder(super.header, this.body, super.footer);
    }

    @Override
    public String toString() {
        return "Report{" +
                "header='" + header + '\'' +
                ", body='" + body + '\'' +
                ", footer='" + footer + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (! super.equals(o)) return false;

        Report report = (Report) o;
        return Objects.equals(body, report.body);
    }

    @Override
    public int hashCode() {
        int hash = super.hashCode();
        hash = 31 * hash + (body != null ? body.hashCode() : 0);
        return hash;
    }

    public static class ReportBuilder {
        private String header;
        private String body;
        private String footer;

        public ReportBuilder() {
        }

        public ReportBuilder(String header, String body, String footer) {
            this.header = header;
            this.body = body;
            this.footer = footer;
        }

        public ReportBuilder header(String header) {
            this.header = header;
            return this;
        }

        public ReportBuilder body(String body) {
            this.body = body;
            return this;
        }

        public ReportBuilder footer(String footer) {
            this.footer = footer;
            return this;
        }

        public Report build() {
            return new Report(this.header, this.body, this.footer);
        }
    }

}
