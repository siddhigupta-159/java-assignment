// 🧩 5. OOPs Problem

// Library Management (Inheritance + Polymorphism)

// Create an abstract class LibraryItem with fields: title, id.

// Add an abstract method calculateLateFee(int daysLate).

// Create two subclasses:

// Book: Late fee = ₹2 per day.

// DVD: Late fee = ₹5 per day.

// In main, create a list of LibraryItem references (both Book and DVD objects), loop through them, and print late fees using polymorphism.

import java.util.ArrayList;

abstract class LibraryItem {
    private String title;
    private int id;

    public LibraryItem(String title, int id) {
        this.id = id;
        this.title = title;
    }

    abstract public int calculateLateFee(int daysLate);

    {
    }

}

class Book extends LibraryItem {
    private String title;
    private int id;

    public Book(String title, int id) {
        super(title, id);
    }

    public int calculateLateFee(int daysLate) {
        return daysLate * 2;
    }

}

class DVD extends LibraryItem {
private Strreing
    public DVD(String title, int id) {
        super(title, id);
    }

    public int calculateLateFee(int daysLate) {
        return daysLate * 5;
    }
}

class Testmain {
    public static void main(String[] args) {
        LibraryItem[] items = {
                new Book("Yaar Jadugar", 101),
                new DVD("MAHABHARAT", 201),
                new Book("Vayuputron ki Sapath", 102),
                new DVD("Ramayan", 202)
        };

        int[] lateDays = { 3, 2, 5, 1 };

        for (int i = 0; i < items.length; i++) {
            System.out.println(" title: " + items[i].title + " ID: " + items[i].id +
                    "Late Fee: " + items[i].calculateLateFee(lateDays[i]));
        }

    }
}
