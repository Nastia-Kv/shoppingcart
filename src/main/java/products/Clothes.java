package products;

/**
 * Created by nastia on 9/17/17.
 */
public class Clothes extends Products {
    int size;


    public Clothes(String productName, int price, int size) {
        super(productName, price);
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
