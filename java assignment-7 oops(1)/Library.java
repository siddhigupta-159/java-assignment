// Book Library Create a
// class Book
// with fields:title,author,
// and price.
// Use setters
// to assign
// values and
// a method
// to print
// book details.

class Book {
    private String title;
    private String author;
    private int price;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void display() {
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
        System.out.println("Book Price: " + price);
    }
}

class Library {
    public static void main(String args[]) {
        Book obj = new Book();
        obj.setTitle("Yaar Jadugar");
        obj.setAuthor("Nilotpal Mrinal");
        obj.setPrice(200);
        obj.display();
    }
}
