package Inheritance.task3_6;

public class Main {
    public static void main(String[] args) {
        Printer redprinter = new RedPrinter();
        Printer uaprinter = new YellowBluePrinter();




        redprinter.print("red text");

        uaprinter.print("two colors text");
    }
}
