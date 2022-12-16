package Generics.task2;

import java.util.ArrayList;
import java.util.List;

public class MyList <T> {
    List<T> list = new ArrayList<T>();

    public List<T> getList() {
        return list;
    }

    public void addElement(T t) {
        list.add(t);
    }

    public int getIndex(T t) {
        return list.indexOf(t);
    }

    public int length() {
        return list.size();
    }

    public static void main(String[] args) {
        MyList<String> mylsit = new MyList<>();
        mylsit.addElement("Example");
        mylsit.addElement("Example1");

        System.out.println(mylsit.getIndex("Example"));
        System.out.println(mylsit.getList());
        System.out.println(mylsit.length());

    }
}
