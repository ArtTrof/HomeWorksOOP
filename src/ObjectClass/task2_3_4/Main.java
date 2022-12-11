package ObjectClass.task2_3_4;

public class Main {
    public static void main(String[] args) {
        Monitor m1 = new Monitor();
        Monitor m2 = new Monitor("DAad","XXXXYYYY",20.5F,15,9);
        System.out.println(m1.toString());

        System.out.println(m1.hashCode());
        System.out.println(m2.hashCode());
        System.out.println(m1.equals(m2));

        EthernetAdapter e1 = new EthernetAdapter();
        EthernetAdapter e2 = new EthernetAdapter();

        System.out.println( e1.toString());

        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
        System.out.println(e1.equals(e2));
    }
}
