class Product {
    private static double discount = 0.0;

    private final int productID;
    private String productName;
    private double price;
    private int quantity;

    public Product(String productName, int productID, double price, int quantity) {
        this.productName = productName;
        this.productID = productID;
        this.price = price;
        this.quantity = quantity;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
        } else {
            System.out.println("Invalid product object.");
        }
    }

    public static void main(String[] args) {
        Product prod1 = new Product("Laptop", 201, 1200.50, 2);
        Product prod2 = new Product("Smartphone", 202, 800.75, 3);

        updateDiscount(10.0);

        prod1.displayProductDetails();
        prod2.displayProductDetails();
    }
}