package ObjectClass.task2_3_4;

public class Device {
    private String manufactured,serialNumber;
    private float price;
    public Device(){

    }
    public Device(String manufactured, String serialNumber, float price) {
        this.manufactured = manufactured;
        this.serialNumber = serialNumber;
        this.price = price;
    }

    public String getManufactured() {
        return manufactured;
    }

    public void setManufactured(String manufactured) {
        this.manufactured = manufactured;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
