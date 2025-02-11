class Book {
    int id;
    String title, author, genre;
    boolean available;
    Book next, prev;

    Book(int id, String title, String author, String genre, boolean available) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.available = available;
    }
}

class Library {
    Book head, tail;

    void addBook(int id, String title, String author, String genre, boolean available) {
        Book newBook = new Book(id, title, author, genre, available);
        if (head == null) {
            head = tail = newBook;
        } else {
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
        }
    }

    void removeBook(int id) {
        Book temp = head;
        while (temp != null) {
            if (temp.id == id) {
                if (temp.prev != null)
                    temp.prev.next = temp.next;
                if (temp.next != null)
                    temp.next.prev = temp.prev;
                if (temp == head)
                    head = temp.next;
                if (temp == tail)
                    tail = temp.prev;
                return;
            }
            temp = temp.next;
        }
    }

    void displayBooks() {
        Book temp = head;
        while (temp != null) {
            System.out
                    .println(temp.id + " " + temp.title + " " + temp.author + " " + temp.genre + " " + temp.available);
            temp = temp.next;
        }
    }
}
