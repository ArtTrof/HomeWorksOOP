package Abstraction_Interfaces.task4_5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Kelvin kelvin = new Kelvin();
        Fahrenheit far = new Fahrenheit();
        Scanner in = new Scanner(System.in);
        System.out.println("input celsium temperature (for example 20,5)");
        double cel=in.nextFloat();
        kelvin.convert(cel);
        far.convert(cel);

    }
}
