
// Design a simple Library Management System using classes with the following:
// A Book class with fields: id, title, author.
// A Library class with methods:
// addBook(Book b)
// listBooks()
// deleteBook(int id)
// Write a program to:
// Add 3 books.
// List all books.
// Delete a book by id and display remaining books.

//  5. Write a Java program to create a class called "Book" with attributes for title, author, and ISBN, 
//   and methods to add and remove books from a collection.

import java.util.ArrayList;

class Library {
    ArrayList<Book> blist = new ArrayList<Book>();

    public void addBook(Book b) {
        blist.add(b);
    }

    public void getid(Book b) {
        blist.get(1234);
    }

    // public void removeid(Book b) {
    //     blist.remove;
    // }

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
    private int id;

    public Book(String title, String author, int id) {
        this.title = title;
        this.author = author;
        this.id = id;

    }

    public Book() {
    }

    public String display() {
        return this.title + " " + this.author + " " + this.id;
    }
}

public class Test3 {
    public static void main(String args[]) {
        Book book1 = new Book("The Hidden Hindu-1", "Akshat Gupta", 1234);
        Book book2 = new Book("yaar jadugar", "nilotapal mrinal", 1589);
        Book book3 = new Book("Vayuputra ki Sapath", "Amish", 1447);
        Library lib = new Library();
        lib.addBook(book1);
        lib.addBook(book2);
        lib.displayBooks();
        lib.addBook(book3);
        lib.displayBooks();
        lib.removeBook(book1);
        lib.displayBooks();
        // lib.removeid(book1);
     
    }
}
