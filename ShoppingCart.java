import java.util.*;

public class ShoppingCart {
    Map productPrices = new HashMap();
    Map addedProducts = new LinkedHashMap();
    Map sortedProducts = new TreeMap();

    public void addProduct(String product, int price) {
        productPrices.put(product, price);
        addedProducts.put(product, price);
    }

    public void displayCart() {
        sortedProducts.putAll(addedProducts);
        System.out.println("Cart Items (Sorted by Price): " + sortedProducts);
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct("Laptop", 1000);
        cart.addProduct("Phone", 700);
        cart.addProduct("Tablet", 500);
        cart.displayCart();
    }
}
