// Problem 7: E-commerce Order System

// Abstract class Order:

// orderId, amount

// abstract methods processOrder(), cancelOrder()

// concrete method orderSummary()

// Subclasses:

// OnlineOrder

// StorePickupOrder

// Interface DiscountApplicable with applyDiscount() method.

// Only OnlineOrder gets discount.

import java.util.*;

interface DiscountApplicable {
    public void applyDiscount(double percentage);
}

abstract class Order {
    private int orderId;
    private double amount;

    public Order(int orderId, double amount) {
        this.orderId = orderId;
        this.amount = amount;
    }

    public int getOrderId() {
        return orderId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public abstract void processOrder();

    public abstract void cancelOrder();

    public void orderSummary() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Total Amount: rs: " + amount);
    }
}

class OnlineOrder extends Order implements DiscountApplicable {

    public OnlineOrder(int orderId, double amount) {
        super(orderId, amount);
    }

    public void processOrder() {
        System.out.println("Online order: " + getOrderId() + " has been processed and will be delivered soon.");
    }

    public void cancelOrder() {
        System.out.println("Online order:" + getOrderId() + " has been cancelled.");
    }

    public void applyDiscount(double percentage) {
        double discount = getAmount() * (percentage / 100);
        setAmount(getAmount() - discount);
        System.out.println("Discount of " + percentage + "% applied. You saved rs" + discount);
    }
}

class StorePickupOrder extends Order {

    public StorePickupOrder(int orderId, double amount) {
        super(orderId, amount);
    }

    public void processOrder() {
        System.out.println("Store pickup order: " + getOrderId() + " is ready for collection at the counter.");
    }

    public void cancelOrder() {
        System.out.println("Store pickup order: " + getOrderId() + " has been cancelled.");
    }
}

class EcommerceOrderSystem {
    public static void main(String[] args) {
        OnlineOrder o1 = new OnlineOrder(101, 2500);
        StorePickupOrder o2 = new StorePickupOrder(102, 1200);

        System.out.println(" Online Order: ");
        o1.orderSummary();
        o1.processOrder();
        o1.applyDiscount(10);
        o1.orderSummary();
        o1.cancelOrder();

        System.out.println(" Store Pickup Order: ");
        o2.orderSummary();
        o2.processOrder();
        o2.cancelOrder();
    }
}
