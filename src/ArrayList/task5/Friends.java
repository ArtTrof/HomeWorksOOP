package ArrayList.task5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Friends {
    public static void main(String[] args) {
        ArrayList<String> friends = new ArrayList<>();
        friends.add("Ira");
        friends.add("Danko");
        friends.add("Adnrej");
        friends.add("Denys");
        friends.add("Djebl");

        System.out.println(friends);

        Collections.sort(friends);

        System.out.println(friends);
    }
}
