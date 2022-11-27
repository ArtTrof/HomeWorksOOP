package Inheritance.task3_3;

public class Car extends Vehicle{
    public Car() {
    }

    public Car(String coordinates, int speed, int price, int year) {
        super(coordinates, speed, price, year);
    }

    void showCar(){
        System.out.println("Car coordinates:"+getCoordinates()+ " price:"+getPrice()+" speed:" +getSpeed()+" +year" +getYear());
    }
}
