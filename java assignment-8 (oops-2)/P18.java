// 18. Write a Java program to create a class called "Restaurant" with attributes for 
// menu items, prices, and ratings, and methods to add and remove items, and to calculate average rating.

import java.util.ArrayList;

class Restaurant {
    private ArrayList<String> menuItems = new ArrayList<String>();
    private ArrayList<Double> prices = new ArrayList<Double>();
    private ArrayList<Integer> ratings = new ArrayList<Integer>();

    public void addItem(String item, double price) {
        menuItems.add(item);
        prices.add(price);
    }

    public void removeItem(String item) {
        int index = menuItems.indexOf(item);
        if (index != -1) {
            menuItems.remove(index);
            prices.remove(index);
            System.out.println(item + " removed from menu.");
        } else {
            System.out.println(item + " not found in menu.");
        }
    }

    public void displayMenu() {
        System.out.println("\n--- Restaurant Menu ---");
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(menuItems.get(i) + " - ₹" + prices.get(i));
        }
    }

    public void addRating(int rating) {
        ratings.add(rating);
    }

    public void averageRating() {
        if (ratings.size() == 0) {
            System.out.println("No ratings yet!");
            return;
        }
        double sum = 0;
        for (int r : ratings) {
            sum += r;
        }
        double avg = sum / ratings.size();
        System.out.println("Average Rating: " + avg);
    }
}

class P18 {
    public static void main(String[] args) {
        Restaurant r = new Restaurant();

        r.addItem("Pizza", 250);
        r.addItem("Burger", 120);
        r.addItem("Pasta", 200);

        r.displayMenu();

        r.addRating(5);
        r.addRating(4);
        r.addRating(3);

        r.averageRating();

        r.removeItem("Burger");
        r.displayMenu();
    }
}
