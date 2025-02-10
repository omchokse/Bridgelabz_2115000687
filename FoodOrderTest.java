abstract class FoodItem {
    private String itemName;
    protected double price;
    protected int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println("Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity + ", Total Price: "
                + calculateTotalPrice());
    }
}

class VegItem extends FoodItem {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    public double calculateTotalPrice() {
        return price * super.quantity;
    }
}

class NonVegItem extends FoodItem {
    private static final double ADDITIONAL_CHARGE = 50;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    public double calculateTotalPrice() {
        return (price + ADDITIONAL_CHARGE) * super.quantity;
    }
}

interface Discountable {
    void applyDiscount(double discount);

    String getDiscountDetails();
}

class FoodOrderTest {
    public static void main(String[] args) {
        FoodItem item1 = new VegItem("Paneer Tikka", 200, 2);
        FoodItem item2 = new NonVegItem("Chicken Biryani", 300, 1);

        item1.getItemDetails();
        item2.getItemDetails();
    }
}