//  5. Write a Java program to create a class called "Book" with attributes for title, author, and ISBN, 
//   and methods to add and remove books from a collection.

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
    private int isbn;

    public Book(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;

    }

    public Book() {
    }

    public String display() {
        return this.title + " " + this.author + " " + this.isbn;
    }
}

public class P5 {
    public static void main(String args[]) {
        Book book1 = new Book("Rich dad poor dad", "kiyosaki", 1234);
        Book book2 = new Book("yaar jadugar", "nilotapal mrinal", 1589);
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
