class Book {
    public String ISBN;
    protected String title;
    private String author;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

class EBook extends Book {
    private String fileSize;

    public EBook(String ISBN, String title, String author, String fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    public void displayDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + getAuthor());
        System.out.println("File Size: " + fileSize);
    }
}

public class Author {
    public static void main(String[] args) {
        Book book = new Book("978-3-16-148410-0", "The Great Book", "John Doe");
        System.out.println("Author: " + book.getAuthor());
        book.setAuthor("Jane Smith");
        System.out.println("Updated Author: " + book.getAuthor());

        EBook eBook = new EBook("978-1-23-456789-0", "Digital Learning", "Alice Cooper", "15MB");
        eBook.displayDetails();
    }
}
