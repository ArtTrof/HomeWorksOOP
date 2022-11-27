package Abstraction_Interfaces.task4_2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        String[] parts = text.split(Pattern.quote("."));
        String text2=parts[parts.length-1];
        System.out.println(text2);

        switch(text2) {

            case ".txt":
                AbstractHandler txt = new TXTHandler();



        }




    }
}
