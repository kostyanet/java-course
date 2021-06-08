package ua.netrebenko.hw10;

abstract public class AbstractReport {
    protected String header;
    protected String footer;

    public AbstractReport(String header, String footer) {
        this.header = header;
        this.footer = footer;
    }
}
