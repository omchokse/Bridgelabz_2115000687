abstract class Product {
    private int productId;
    private String name;
    protected double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public abstract double calculateDiscount();

    public void displayDetails() {
        System.out.println("ID: " + productId + ", Name: " + name + ", Final Price: " + (price - calculateDiscount()));
    }
}

class Electronics extends Product {
    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    public double calculateDiscount() {
        return super.price * 0.10;
    }
}

class Clothing extends Product {
    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    public double calculateDiscount() {
        return super.price * 0.20;
    }
}

interface Taxable {
    double calculateTax();

    String getTaxDetails();
}

class ProductTest {
    public static void main(String[] args) {
        Product p1 = new Electronics(201, "Laptop", 80000);
        Product p2 = new Clothing(202, "Jacket", 5000);
        p1.displayDetails();
        p2.displayDetails();
    }
}
