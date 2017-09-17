package products;

/**
 * Created by nastia on 9/17/17.
 */
public class Products {

    private String productName;
    private double price;
    private Boolean isCloth;

    public Products(String productName, double price, Boolean isCloth) {
        this.productName = productName;
        this.price = price;
        this.isCloth = isCloth;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public Boolean getIfItIsCloth() {
        return isCloth;
    }

}
