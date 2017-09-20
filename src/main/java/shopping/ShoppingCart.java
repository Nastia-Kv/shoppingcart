package shopping;

import products.Clothes;
import products.Products;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nastia on 9/17/17.
 */
public class ShoppingCart {
    List<Products> listofProducts = new ArrayList();
    double price = 0;
    Class cloth = Clothes.class;
    boolean isCloth = cloth.isInstance(cloth);


    public void addItem(Products products) {
        if (listofProducts.size() < 10) {
            listofProducts.add(products);
            System.out.println(listofProducts.size() + " item(s) added.");
            if (isCloth) {
                price += products.getPrice() * 1.1;

            } else {
                price += products.getPrice();
            }
            System.out.println("Total price is " + price);

        } else {
            System.out.println("Limit exceeded! Maximum 10 items can be added to shopping cart");
        }
    }

    public void removeItem(Products products) {
        listofProducts.remove(products);
        System.out.println(products.getProductName() + " removed");

    }

    public void getStatus() {
        System.out.println("Item(s) in your shopping cart:");
        for (Products product : listofProducts) {
            String name = product.getProductName();
            double priceOfItem = product.getPrice();
            System.out.println(name + " - " + priceOfItem);
        }
        System.out.println("Total price " + price + " for " + listofProducts.size() + " items");

    }

    public void checkOut() {
        listofProducts.clear();
        System.out.println("Shopping cart is empty - " + listofProducts.size());
    }


}
