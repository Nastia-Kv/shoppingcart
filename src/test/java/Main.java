import products.Clothes;
import products.Food;
import products.Product;
import products.ProductType;
import shopping.ShoppingCart;

/**
 * Created by nastia on 9/17/17.
 */
public class Main {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

//        Product tShirt = new Clothes("H&M blue T-Shirt", 100, 5);
//        Product tShirt1 = new Clothes("H&M red T-Shirt", 89, 7);
//        Product tShirt2 = new Clothes("H&M black T-Shirt", 99, 6);
//        Product tShirt3 = new Clothes("H&M orange T-Shirt", 49, 10);
//
//        Product skirt = new Clothes("One Look", 110, 12);
//        Product skirt1 = new Clothes("One Look", 79, 11);
//        Product skirt2 = new Clothes("One Look", 150, 6);
//        Product skirt3 = new Clothes("One Look", 30, 4);
//
//        Product milk = new Food("Molokia", 20, "30/10/2017");
//        Product milk1 = new Food("Molokia", 21.5, "20/11/2017");
        Product bread = new Food("Khlibna khata", 21.7, ProductType.FOOD,"25/11/2017");


//        shoppingCart.addItem(tShirt);
//        shoppingCart.addItem(tShirt1);
//        shoppingCart.addItem(tShirt2);
//        shoppingCart.addItem(tShirt3);
//        shoppingCart.addItem(skirt);
//        shoppingCart.addItem(skirt1);
//        shoppingCart.addItem(skirt2);
//        shoppingCart.addItem(skirt3);
//        shoppingCart.addItem(milk);
//        shoppingCart.addItem(milk1);
        shoppingCart.addItem(bread);

        shoppingCart.getStatus();
        shoppingCart.removeItem(bread);
        shoppingCart.checkOut();


    }
}
