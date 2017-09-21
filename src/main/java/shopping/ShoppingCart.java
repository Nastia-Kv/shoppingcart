package shopping;

import products.Clothes;
import products.Product;
import products.ProductType;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nastia on 9/17/17.
 */
public class ShoppingCart {
    List<Product> listofProducts;
    double totalPrice = 0;
    ProductType productType;
    Product product;

    public ShoppingCart() {
        listofProducts = new ArrayList<Product>();
    }

//    public void addItem(Product products) {
//        if (listofProducts.size() < 10) {
//            listofProducts.add(products);
//            System.out.println(listofProducts.size() + " item(s) added.");
//            if (isCloth) {
//                price += products.getPrice() * 1.1;
//
//            } else {
//                price += products.getPrice();
//            }
//            System.out.println("Total price is " + price);
//
//        } else {
//            System.out.println("Limit exceeded! Maximum 10 items can be added to shopping cart");
//        }
//    }

    public void addItem(Product products) {
        if (listofProducts.size() >= 10) {
            System.out.println("Limit exceeded! Maximum 10 items can be added to shopping cart");
            return;
        }
        listofProducts.add(products);
        System.out.println(listofProducts.size() + " item(s) added.");
    }

    public void removeItem(Product products) {
        listofProducts.remove(products);
        System.out.println(products.getProductName() + " removed");

    }

    public void getStatus() {
            if (product.getType() instanceof){
            totalPrice = product.getPrice() + product.getPrice();
            System.out.println(totalPrice);
        }
//        System.out.println("Item(s) in your shopping cart:");
//        for (Product product : listofProducts) {
//            String name = product.getProductName();
//            double priceOfItem = product.getPrice();
//            System.out.println(name + " - " + priceOfItem);
//        }
//        System.out.println("Total price " + totalPrice + " for " + listofProducts.size() + " items");

    }

    public void checkOut() {
        listofProducts.clear();
        System.out.println("Shopping cart is empty - " + listofProducts.size());
    }


}
