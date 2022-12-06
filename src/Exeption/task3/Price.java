package Exeption.task3;

public class Price {
    String product,store;
    final  String CURR="UAH";
    int price;

    public Price(String product, String store, int price) {
        this.product = product;
        this.store = store;
        this.price = price;

    }
}
