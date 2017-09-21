package products;

/**
 * Created by nastia on 9/17/17.
 */
public class Food extends Product {

    private String bestBefore;

    public Food(String productName, double price, ProductType type, String bestBefore) {
        super(productName, price, type);
        this.bestBefore = bestBefore;
    }

    public String getBestBefore() {
        return bestBefore;
    }
}
