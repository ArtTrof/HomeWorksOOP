package task3_6;

public class YellowBluePrinter extends Printer {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static final String ANSI_YELLOW = "\u001B[43m";

    @Override
    void print(String value) {
        super.print(ANSI_YELLOW + ANSI_BLUE + value + ANSI_RESET);
    }
}
