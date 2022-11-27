package Inheritance.task3_2;

public class BadPupil extends Pupil{

    public BadPupil(int age, String name) {
        super(age,name);
    }

    public BadPupil(int age, String name, int height) {
        super(age,name,height);
    }

    @Override
    void study(){
        System.out.println("Study bad");
    }
    @Override
    void read(){
        System.out.println("Read never");
    }
    @Override
    void write(){
        System.out.println("Write awful");
    }
    @Override
    void relax(){
        System.out.println("Always relax");
    }

}
