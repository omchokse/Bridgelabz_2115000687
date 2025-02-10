abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public abstract int getLoanDuration();

    public void getItemDetails() {
        System.out.println("ID: " + itemId + ", Title: " + title + ", Author: " + author);
    }
}

class Book extends LibraryItem {
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 14;
    }
}

class Magazine extends LibraryItem {
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 7;
    }
}

class DVD extends LibraryItem {
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 3;
    }
}

interface Reservable {
    void reserveItem();

    boolean checkAvailability();
}

class LibraryTest {
    public static void main(String[] args) {
        LibraryItem item1 = new Book("B101", "Java Programming", "John Doe");
        LibraryItem item2 = new Magazine("M202", "Tech Today", "Jane Smith");
        LibraryItem item3 = new DVD("D303", "Science Documentary", "Dr. Brown");

        item1.getItemDetails();
        System.out.println("Loan Duration: " + item1.getLoanDuration() + " days");

        item2.getItemDetails();
        System.out.println("Loan Duration: " + item2.getLoanDuration() + " days");

        item3.getItemDetails();
        System.out.println("Loan Duration: " + item3.getLoanDuration() + " days");
    }
}