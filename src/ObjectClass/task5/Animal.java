package ObjectClass.task5;

public class Animal {
    public String name;
    public int age;
    public boolean tail;

    @Override
    public String toString() {
        return "Name:Vasia,age:45,tail:no";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        else
            return true;

    }

    @Override
    public int hashCode() {
        int res;
        res = (hashCode() + 30) / 2;
        return res;
    }
}
