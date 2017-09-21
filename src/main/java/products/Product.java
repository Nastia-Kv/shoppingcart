package products;

/**
 * Created by nastia on 9/17/17.
 */
public class Product {

    private String productName;
    private double price;
    private ProductType type;

    public Product(String productName, double price, ProductType type) {
        this.productName = productName;
        this.price = price;
        this.type = type;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public ProductType getType() {
        return type;
    }

}
