package Generics.task5;

public class MyClass <T>{

    //не до кінця зрозумів концепт того ще треба але мб так ?

        public static <T> void factoryMethod(T t) {
        System.out.println(t.toString());
    }


    public static void main(String[] args) {
      MyClass.factoryMethod(new String("test"));
    }
}
