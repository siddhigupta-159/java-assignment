// Write a Java program to create a class called "Inventory" with a collection of products 
// and methods to add and remove products, and to check for low inventory.

import java.util.ArrayList;

class Inventory {
    ArrayList<Product> plist = new ArrayList<Product>();

    public void addProduct(Product p) {
        plist.add(p);
    }

    public void removeProduct(Product p) {
        plist.remove(p);
    }

    public void displayproduct() {
        for (Product product : plist) {
            System.out.println("Product:" + product.getdetails());
        }
    }

    public void inventorysize() {
        if (plist.size() <= 15) {
            System.out.println("Inventory is low");
        } else if (plist.size() >= 15 && plist.size() <= 500) {
            System.out.println("Enough products in inventory");
        } else
            System.out.println("Inventory is empty");
    }
}

class Product {
    private String productname;

    public Product(String productname) {
        this.productname = productname;
    }

    public String getdetails() {
        return productname;
    }
}

class P13 {
    public static void main(String[] args) {
        Product p1 = new Product("Shampoo");
        Product p2 = new Product(" condtionor");
        Inventory i = new Inventory();
        i.addProduct(p1);
        i.addProduct(p2);
        i.displayproduct();
        i.inventorysize();
        i.removeProduct(p2);
        i.displayproduct();
    }
}