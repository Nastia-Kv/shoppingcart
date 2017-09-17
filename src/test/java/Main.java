import products.Clothes;
import products.Food;
import products.Products;
import shopping.ShoppingCart;

/**
 * Created by nastia on 9/17/17.
 */
public class Main {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        Products tShirt = new Clothes("H&M blue T-Shirt", 100, true, 5);
        Products tShirt1 = new Clothes("H&M red T-Shirt", 89, true, 7);
        Products tShirt2 = new Clothes("H&M black T-Shirt", 99, true, 6);
        Products tShirt3 = new Clothes("H&M orange T-Shirt", 49, true, 10);

        Products skirt = new Clothes("One Look", 110, true, 12);
        Products skirt1 = new Clothes("One Look", 79, true, 11);
        Products skirt2 = new Clothes("One Look", 150, true, 6);
        Products skirt3 = new Clothes("One Look", 30, true, 4);

        Products milk = new Food("Molokia", 20, false, "30/10/2017");
        Products milk1 = new Food("Molokia", 21.5, false, "20/11/2017");
        Products bread = new Food("Khlibna khata", 21.7, false, "25/11/2017");


        shoppingCart.addItem(tShirt);
        shoppingCart.addItem(tShirt1);
        shoppingCart.addItem(tShirt2);
        shoppingCart.addItem(tShirt3);
        shoppingCart.addItem(skirt);
        shoppingCart.addItem(skirt1);
        shoppingCart.addItem(skirt2);
        shoppingCart.addItem(skirt3);
        shoppingCart.addItem(milk);
        shoppingCart.addItem(milk1);
        shoppingCart.addItem(bread);

        shoppingCart.getStatus();
        shoppingCart.removeItem(tShirt);
        shoppingCart.checkOut();


    }
}
