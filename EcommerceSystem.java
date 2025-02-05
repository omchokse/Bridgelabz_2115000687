import java.util.ArrayList;

class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class Order {
    ArrayList<Product> products;

    public Order() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void showOrder() {
        System.out.println("Order Details:");
        for (Product p : products) {
            System.out.println(p.name + " - $" + p.price);
        }
    }
}

class Customer {
    String name;
    ArrayList<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }
}

public class EcommerceSystem {
    public static void main(String[] args) {
        Customer customer = new Customer("John");
        Order order = new Order();
        Product product1 = new Product("Laptop", 1000);
        Product product2 = new Product("Phone", 500);

        order.addProduct(product1);
        order.addProduct(product2);
        customer.placeOrder(order);

        order.showOrder();
    }
}