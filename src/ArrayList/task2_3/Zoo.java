package ArrayList.task2_3;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        ArrayList<String> zoo = new ArrayList<>(); //завдання 2

        zoo.add("cat");
        zoo.add("dog");
        zoo.add("cow");
        zoo.add("rabbit");
        zoo.add("horse");
        zoo.add("racoon");
        zoo.add("monkey");
        zoo.add("zebra");

        System.out.println(zoo);
                                                     //завдання 3
        zoo.remove(6);
        zoo.remove(4);
        zoo.remove(2);

        System.out.println(zoo.size());

        System.out.println(zoo);
    }
}
