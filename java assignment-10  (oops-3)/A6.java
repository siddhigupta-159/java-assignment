// question-18 =  Create class Product (pid, price, quantity) with parameterized
//   constructor.Create a main function in different class (say XYZ) and perform
//   following task:
//   Accept five product information from user and store in an array
//   Find Pid of product with highest price.
//   Create method (with array of product’s object as argument) in XYZ class to
//   calculate and return total amount spent on all products. (amount spent on
//   single product=price of product * quantity of product).

import java.util.Scanner;

class Product {
    int pid;
    double price;
    int quantity;

    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }
}

class XYZ {
    public static double totalAmount(Product[] products) {
        double total = 0;
        for (Product p : products) {
            total += p.price * p.quantity;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] products = new Product[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter product ID: ");
            int pid = sc.nextInt();
            System.out.print("Enter product price: ");
            double price = sc.nextDouble();
            System.out.print("Enter product quantity: ");
            int quantity = sc.nextInt();
            products[i] = new Product(pid, price, quantity);
        }

        double maxPrice = products[0].price;
        int maxPid = products[0].pid;
        for (Product p : products) {
            if (p.price > maxPrice) {
                maxPrice = p.price;
                maxPid = p.pid;
            }
        }
        System.out.println("Product ID with highest price: " + maxPid);

        double total = totalAmount(products);
        System.out.println("Total amount spent on all products: " + total);
    }
}