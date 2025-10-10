// Write a Java program to create a class called "Library" with a collection of
// books and methods to add and remove books.

import java.util.ArrayList;

class Library {
    ArrayList<Book> blist = new ArrayList<Book>();

    public void addBook(Book b) {
        blist.add(b);
    }

    public void removeBook(Book b) {
        blist.remove(b);
    }

    public void displayBooks() {
        for (Book book : blist) {
            System.out.println(book.display());
        }
    }
}

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book() {
    }

    public String display() {
        return this.title + " " + this.author;
    }
}

public class P11 {
    public static void main(String args[]) {
        Book book1 = new Book("Rich dad poor dad", "kiyosaki");
        Book book2 = new Book("yaar jadugar", "nilotapal mrinal");
        // book1.display();
        // book2.display();
        Library lib = new Library();
        lib.addBook(book1);
        lib.addBook(book2);
        lib.displayBooks();
        lib.removeBook(book2);
        lib.displayBooks();

    }
}
