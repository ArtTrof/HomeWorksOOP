package CourseTask2;

import java.util.LinkedList;
import java.util.List;

public class LinkedLists {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Cat");
        list.add("Dog");
        list.add("Horse");
        System.out.println(list);

        list.addFirst("Bee");
        list.addLast("Penguin");

        System.out.println(list);

        list.removeLast();
        list.removeFirst();
        System.out.println(list);

        System.out.println("First elem of list:"+list.getFirst());
        System.out.println("Last elem of list:"+list.getLast());
        System.out.println("List size:"+list.size());
    }
}
