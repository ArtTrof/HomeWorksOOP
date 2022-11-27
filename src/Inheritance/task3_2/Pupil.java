package Inheritance.task3_2;

public class Pupil {
    int age;
    String name;
    int height;

    public Pupil() {
    }

    public Pupil(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Pupil(int age, String name, int height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    void study() {
    }

    void read() {
    }

    void write() {
    }

    void relax() {
    }
}
