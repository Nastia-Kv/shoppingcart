package products;

/**
 * Created by nastia on 9/17/17.
 */
public class Clothes extends Product {
    int size;

    public Clothes(String productName, int price, ProductType type, int size) {
        super(productName, price, type);
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
