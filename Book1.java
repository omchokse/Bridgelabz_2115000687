class Book1 {
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    public Book1(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have successfully borrowed: " + title);
        } else {
            System.out.println("Sorry, " + title + " is currently unavailable.");
        }
    }

    public void display() {
        System.out.println(
                "Title: " + title + ", Author: " + author + ", Price: $" + price + ", Available: " + isAvailable);
    }

    public static void main(String[] args) {
        Book1 book1 = new Book1("1984", "George Orwell", 15.99, true);
        book1.display();
        book1.borrowBook();
        book1.display();
    }
}
