package StaticNestedAnonimEnum.task2;

enum Animals {
    MONKEY(10) , DOG(9) , CAT(7) , HORSE(20);

    int age;

    Animals(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Animal: " + super.toString() + " age " + getAge() + " years";
    }

    public int getAge() {
        return age;
    }


}
