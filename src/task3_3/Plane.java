package task3_3;

public class Plane extends Vehicle{
    int height, passengers;

    public Plane(int height, int passengers) {
        this.height = height;
        this.passengers = passengers;
    }

    public Plane(String coordinates, int speed, int price, int year, int height, int passengers) {
        super(coordinates, speed, price, year);
        this.height = height;
        this.passengers = passengers;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
    void showPlane(){
        System.out.println("Plane coordinates:"+getCoordinates()+" height:"+getHeight()+
                " passengers q-ty:"+getPassengers()+" price:"+getPrice()+" speed:" +getSpeed()+" +year" +getYear());
    }
}
