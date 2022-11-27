package Inheritance.task3_6;

public class RedPrinter extends  Printer{
    public static final String ANSI_ReD = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    @Override
    void print(String value){
        super.print(ANSI_ReD+value+ANSI_RESET);
    }

}
