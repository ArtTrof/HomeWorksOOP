package task3_2;

public class ExcelentPupil extends Pupil{

    public ExcelentPupil(int age, String name) {
        super(age,name);
    }
    public ExcelentPupil(int age, String name, int height) {
        super(age,name,height);
    }

        @Override
    void study(){
        System.out.println("Study hard");
    }
    @Override
    void read(){
        System.out.println("Read much");
    }
    @Override
    void write(){
        System.out.println("Write good");
    }
    @Override
    void relax(){
        System.out.println("Never relax");
    }

}
