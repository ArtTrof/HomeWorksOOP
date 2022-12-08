package Exception.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Price[] price = new Price[2];

        for (int i = 0; i < price.length; i++) {
            System.out.println("Input product:");
            String name = in.nextLine();
            System.out.println("Input store:");
            String store = in.nextLine();
            System.out.println("Input price:");
            Double cost = in.nextDouble();

            price[i] = new Price(name, store, cost);
        }

        for (int i = 0; i < price.length; i++) {
            System.out.println(price.toString());
        }

        System.out.println("input store name");
        String shop_name = in.nextLine();

        for (int i = 0; i < price.length; i++) {
            String name = price[i].store;
            if(name.equals(price[i].store))
            {
                System.out.println(price[i].toString());
            }
            else{
                throw new Exception();
            }
        }

    }
}
