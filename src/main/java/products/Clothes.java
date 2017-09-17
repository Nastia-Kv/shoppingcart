package products;

/**
 * Created by nastia on 9/17/17.
 */
public class Clothes extends Products {
    int size;


    public Clothes(String productName, int price, Boolean isCloth, int size) {
        super(productName, price, isCloth);
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
