package Exeption.task3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String product,store;
        int price;

        ArrayList<Price> list=new ArrayList<Price>();
        System.out.println("Input product name");
        product = in.nextLine();
        System.out.println("Input store name");
        store = in.nextLine();
        System.out.println("Input price name");
        price = in.nextInt();

        Price obj1 = new Price(product,store,price);
        list.add(obj1);

    }
}
