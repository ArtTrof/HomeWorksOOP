package Inheritance.task3_2;

public class ClassRoom {

    public static void main(String[] args) {
        ExcelentPupil pupil1 = new ExcelentPupil(10,"Maria");
        GoodPupil pupil2 = new GoodPupil(12,"Zina",180);
        BadPupil pupil3 = new BadPupil(60,"Ira");
        System.out.println("Excelent pupil age:"+pupil1.getAge()+" name:"+pupil1.getName()+" She does:");
        pupil1.read();
        pupil1.write();
        pupil1.relax();
        pupil1.study();

        System.out.println("Good pupil  age:"+pupil2.getAge()+" name:"+pupil2.getName()+" height" + pupil2.getHeight()+" She does:");
        pupil2.read();
        pupil2.write();
        pupil2.relax();
        pupil2.study();

        System.out.println("Bad age:"+pupil3.getAge()+" name:"+pupil3.getName()+" She does:");
        pupil3.read();
        pupil3.write();
        pupil3.relax();
        pupil3.study();
              }
}

