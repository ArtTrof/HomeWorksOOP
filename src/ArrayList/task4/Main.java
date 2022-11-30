package ArrayList.task4;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        ListIterator<Integer> listiterator = numbers.listIterator();

        while (listiterator.hasNext()){
        Integer obj = listiterator.next();
        obj +=1;
            System.out.println(obj);
        }

    }
}
