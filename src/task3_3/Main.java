package task3_3;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Usa",200,100,2009);
        Ship ship=new Ship("Usa",200,100,2009,"Dubai",20);
        Plane plane=new Plane("Usa",200,100,2009,2000,100);
        car.showCar();
        ship.showShip();
        plane.showPlane();
    }
}
