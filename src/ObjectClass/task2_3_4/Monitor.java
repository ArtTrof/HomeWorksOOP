package ObjectClass.task2_3_4;

public class Monitor extends Device{
    private int resolutionX,resolutionY;
    public Monitor(){}
    public Monitor(int resolutionX, int resolutionY) {
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public Monitor(String manufactured, String serialNumber, float price, int resolutionX, int resolutionY) {
        super(manufactured, serialNumber, price);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }
    @Override
    public String toString(){
        return "From Monitor class.Device: manufacturer = Samsung, price = 120, serialNumber=AB1234567CD, X=1280,Y=1024";
    }
    @Override
    public int hashCode(){
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object o){
        return true;
    }
}
