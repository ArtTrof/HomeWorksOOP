package Inheritance.task3_3;

public class Vehicle {
    String coordinates;
    int speed, price, year;

    public Vehicle() {
    }

    public Vehicle(String coordinates, int speed, int price, int year) {
        this.coordinates = coordinates;
        this.speed = speed;
        this.price = price;
        this.year = year;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
