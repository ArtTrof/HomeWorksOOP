package Inheritance.task3_2;

public class GoodPupil extends Pupil{

    public GoodPupil(int age, String name) {
        super(age,name);
    }
    public GoodPupil(int age, String name, int height) {
        super(age,name,height);
    }

    @Override
    void study(){
        System.out.println("Study average");
    }
    @Override
    void read(){
        System.out.println("Read average");
    }
    @Override
    void write(){
        System.out.println("Write average");
    }
    @Override
    void relax(){
        System.out.println("Sometimes relax");
    }

}
