package ArrayList.task6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> teachers = new ArrayList<>();
        teachers.add("Natalia Bilyk");
        teachers.add("Oleg Barysh");
        teachers.add("Olga Hz");
        teachers.add("Valentina STEPANOVNA");
        teachers.add("Iryna Mazij");

        System.out.println("Best teacher index: "+teachers.indexOf("Iryna Mazij"));
        System.out.println("Worst teacher index: "+teachers.indexOf("Valentina STEPANOVNA"));
        System.out.println(teachers);

    }
}
