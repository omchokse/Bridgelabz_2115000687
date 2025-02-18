class Product<T> {
    String name;
    double price;
    T category;

    Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    void display() {
        System.out.println(name + " | Price: $" + price + " | Category: " + category);
    }

    static <T> void applyDiscount(Product<T> product, double percentage) {
        product.price -= product.price * (percentage / 100);
    }
}

class BookCategory {
    public String toString() {
        return "Books";
    }
}

class ClothingCategory {
    public String toString() {
        return "Clothing";
    }
}

public class Products {
    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>("Java Programming", 50, new BookCategory());
        Product<ClothingCategory> shirt = new Product<>("T-Shirt", 20, new ClothingCategory());

        book.display();
        shirt.display();

        Product.applyDiscount(book, 10);
        Product.applyDiscount(shirt, 15);

        book.display();
        shirt.display();
    }
}