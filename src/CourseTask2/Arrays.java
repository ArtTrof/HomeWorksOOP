package CourseTask2;

import java.util.ArrayList;
import java.util.List;

public class Arrays {
    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);

        arr.add(1,3);
        System.out.println(arr);
        System.out.println("first elemet of arr" + arr.get(1));
        System.out.println("arr contains 2? "+arr.contains(2));
        System.out.println(arr.size());
        arr.remove(1);
        System.out.println("arr after removing 1 element "+ arr);
        arr.clear();
        System.out.println("arr after clear : ");


    }
}
