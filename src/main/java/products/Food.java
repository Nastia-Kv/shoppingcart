package products;

/**
 * Created by nastia on 9/17/17.
 */
public class Food extends Products {

    String bestBefore;

    public Food(String productName, double price, Boolean isCloth, String bestBefore) {
        super(productName, price, isCloth);
        this.bestBefore = bestBefore;
    }

    public String getBestBefore() {
        return bestBefore;
    }
}
