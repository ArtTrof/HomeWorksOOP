package Exception.task5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        Calculator calc =  new Calculator();
        System.out.println("input a: ");
        double a = in.nextDouble();
        System.out.println("input b: ");
        double b = in.nextDouble();

        System.out.println("Input operator( +,-,*,/");
        String operator = in.nextLine();

        switch(operator) {
            case ("+"):
                System.out.println("Answer" + calc.add(a, b));
                break;
            case ("-"):
                System.out.println("Answer" + calc.sub(a, b));
                break;
            case ("*"):
                System.out.println("Answer" + calc.mul(a, b));
                break;
            case ("/"):
                try {
                    System.out.println("Answer" + calc.div(a, b));
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("Wrong operator");
        }



    }
}
