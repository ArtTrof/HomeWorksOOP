package Abstraction_Interfaces.task4_2;

public class DOCHandler extends AbstractHandler {
    @Override
    void open() {
        System.out.println(" file opened");
    }

    @Override
    void create(){
        System.out.println("  file created");
    }

    @Override
    void change() {
        System.out.println("  file changed");
    }

    @Override
    void save() {
        System.out.println("  file saved");
    }
}
