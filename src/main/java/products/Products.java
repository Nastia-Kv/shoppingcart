package products;

/**
 * Created by nastia on 9/17/17.
 */
public class Products {

    private String productName;
    private double price;

    public Products(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

}
