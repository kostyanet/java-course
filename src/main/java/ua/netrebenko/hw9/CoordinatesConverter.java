package ua.netrebenko.hw9;

/**
 * Converts chess coordinates into absolute coordinate increments.
 */
public class CoordinatesConverter {
    private final static String X = "ABCDEFGH";
    private final static String Y = "12345678";
    private String current;
    private String next;

    static int getDiff(char current, char next, String reference) {
        return Math.abs(reference.indexOf(current) - reference.indexOf(next));
    }

    public void setCoordinates(String current, String next) {
        this.current = current.toUpperCase();
        this.next = next.toUpperCase();
    }

    public int getXDiff() {
        return getDiff(current.charAt(0), next.charAt(0), X);
    }

    public int getYDiff() {
        return getDiff(current.charAt(1), next.charAt(1), Y);
    }
}
