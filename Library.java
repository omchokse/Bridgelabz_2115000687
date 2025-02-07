class Book {
    String title;
    int publicationYear;

    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
}

class Author extends Book {
    String name, bio;

    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    void displayInfo() {
        System.out.println(title + " " + publicationYear + " " + name + " " + bio);
    }
}

public class Library {
    public static void main(String[] args) {
        Author a = new Author("Java Basics", 2020, "John Doe", "Software Engineer");
        a.displayInfo();
    }
}
