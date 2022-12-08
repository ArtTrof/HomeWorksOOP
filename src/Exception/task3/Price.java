package Exception.task3;

public class Price {
    String product,store;
    static final  String CURR="UAH";
    double price;

    public Price(String product, String store, double price) {
        this.product = product;
        this.store = store;
        this.price = price;

    }
    public String toString(){
        return "Product:"+this.product+ " store:"+ this.store + " price:"+this.price;
    }
}
