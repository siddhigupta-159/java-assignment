//  Object-Oriented Programming Problem
//  Problem: Library Management (Classes & Inheritance)

// Create a small library system:

// Create a base class Book with:

// title, author, price.

// A method displayInfo() to print book details.

// Create a derived class EBook with:

// fileSize (in MB) and format.

// Override displayInfo() to include ebook details.

// In main(), create an array of Book references, store both Book and EBook objects, and print their details using polymorphism.

class Book {
    String title;
    String author;
    double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayInfo() {
        System.out.println("Title: " + title + " " + "Author: " + author + " " + "Price: Rs." + price);
    }
}

class EBook extends Book {
    double fileSize;
    String format;

    EBook(String title, String author, double price, double fileSize, String format) {
        super(title, author, price);
        this.fileSize = fileSize;
        this.format = format;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("File Size: " + fileSize + " MB," + " " + "Format: " + format);
    }
}

class LibraryManagement {
    public static void main(String[] args) {
        Book[] library = new Book[4];

        library[0] = new Book("yaar jadugar", "Nilotpal mrinal", 150.0);
        library[1] = new EBook("MahaBharat", "Vedvyas", 600.0, 980, "PDF");
        library[2] = new Book("Dark Horse", "Nilotpal Mrinal", 200.0);
        library[3] = new EBook("Vayuputron ki Sapath", "Amish", 350.0, 120, "PDF");

        for (Book bk : library) {
            bk.displayInfo();
        }
    }
}
