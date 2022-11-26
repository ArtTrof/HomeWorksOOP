package task3_3;

public class Ship extends Vehicle{
    String port;
    int passengers;

    public Ship(String port, int passengers) {
        this.port = port;
        this.passengers = passengers;
    }

    public Ship(String coordinates, int speed, int price, int year, String port, int passengers) {
        super(coordinates, speed, price, year);
        this.port = port;
        this.passengers = passengers;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    void showShip(){
        System.out.println("Ship coordinates:"+getCoordinates()+" Port:"+getPort()+
        " passengers q-ty:"+getPassengers()+" price:"+getPrice()+" speed:" +getSpeed()+" +year" +getYear());
    }
}
