package Abstraction_Interfaces.task4_2;

import java.util.Scanner;
import java.util.regex.Pattern;


public class Main {
    public static void main(String[] args) {
        boolean decision = true;
        System.out.println("Input name file like *.doc/.xml/.txt");
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        String[] parts = text.split(Pattern.quote("."));
        String text2 = parts[parts.length - 1];

        switch (text2) {
            case "txt":
                TXTHandler txt = new TXTHandler();
                while (decision == true) {
                    System.out.println("choose what u want do like 'open' 'create' ' save' 'change'");
                    String text3 = in.nextLine();
                    if (text3.equals("open")) {
                        System.out.println(text);
                        txt.open();
                    } else if (text3.equals("create")) {
                        System.out.println(text);
                        txt.create();
                    } else if (text3.equals("save")) {
                        System.out.println(text);
                        txt.save();
                    } else if (text3.equals("change")) {
                        System.out.println(text);
                        txt.change();
                    } else {
                        System.out.println("wrong option chosen");
                    }
                    System.out.println("You want continue?'yes' or 'no'");
                    String var = in.nextLine();
                    if (var.equals("yes")) {
                        decision = true;
                    } else if (var.equals("no")) {
                        decision = false;
                    }
                }
                System.out.println("Thanks have a great day");
                break;
            case "doc":
                TXTHandler doc = new TXTHandler();
                while (decision == true) {
                    System.out.println("choose what u want do like 'open' 'create' ' save' 'change'");
                    String text3 = in.nextLine();
                    switch (text3) {
                        case "open" -> {
                            System.out.println(text);
                            doc.open();
                        }
                        case "create" -> {
                            System.out.println(text);
                            doc.create();
                        }
                        case "save" -> {
                            System.out.println(text);
                            doc.save();
                        }
                        case "change" -> {
                            System.out.println(text);
                            doc.change();
                        }
                        default -> System.out.println("wrong option chosen");
                    }
                    System.out.println("You want continue?'yes' or 'no'");
                    String var = in.nextLine();
                    if (var.equals("yes")) {
                        decision = true;
                    } else if (var.equals("no")) {
                        decision = false;
                    }
                }
                System.out.println("Thanks have a great day");
                break;
            case "xml":
                TXTHandler xml = new TXTHandler();
                while (decision == true) {
                    System.out.println("choose what u want do like 'open' 'create' ' save' 'change'");
                    String text3 = in.nextLine();
                    switch (text3) {
                        case "open" -> {
                            System.out.println(text);
                            xml.open();
                        }
                        case "create" -> {
                            System.out.println(text);
                            xml.create();
                        }
                        case "save" -> {
                            System.out.println(text);
                            xml.save();
                        }
                        case "change" -> {
                            System.out.println(text);
                            xml.change();
                        }
                        default -> System.out.println("wrong option chosen");
                    }
                    System.out.println("You want continue?'yes' or 'no'");
                    String var = in.nextLine();
                    if (var.equals("yes")) {
                        decision = true;
                    } else if (var.equals("no")) {
                        decision = false;
                    }
                }
                System.out.println("Thanks have a great day");
                break;
            default:
                System.out.println("wrong format");
        }


    }
}
