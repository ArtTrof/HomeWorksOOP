package ObjectClass.task2_3_4;

public class EthernetAdapter extends Device {
    private int speed;
    private String mac;

    public EthernetAdapter(){}
    public EthernetAdapter(int speed, String mac) {
        this.speed = speed;
        this.mac = mac;
    }

    public EthernetAdapter(String manufactured, String serialNumber, float price, int speed, String mac) {
        super(manufactured, serialNumber, price);
        this.speed = speed;
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    @Override
    public String toString() {
        return "From adapter class.Device: manufacturer = Samsung, price = 120, serialNumber=AB1234567CD, X=1280,Y=1024";
    }
    @Override
    public int hashCode(){
        int hash = 10;
        return hash;
    }
    @Override
    public boolean equals(Object o){
        return false;
    }

}
