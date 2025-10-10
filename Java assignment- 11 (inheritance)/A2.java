//  Problem Set on Abstract Class, Inheritance & Interface
// Problem 1: Payment Gateway System 

// Create an abstract class Payment with:

// amount field

// abstract method pay()

// concrete method paymentDetails()

// Subclasses:

// CreditCardPayment

// DebitCardPayment

// UPIPayment

// Create an interface Refundable with processRefund() method.

// Only CreditCardPayment and UPIPayment should implement Refundable.

// In main class, create different payments and process refund where applicable.

interface Refundable {
    public void processRefund();
}

abstract class Payment {
    private double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    abstract public void pay();

    public void paymentDetails() {
        System.out.println("payment of rupees " + this.amount + " " + "intiated");
    }
}

class CreditCardPayment extends Payment implements Refundable {
    private double amount;

    public CreditCardPayment(double amount) {
        super(amount);
        this.amount = amount;
    }

    public void pay() {
        System.out.println("paid amount of " + " " + this.amount + " " + "rupees via Credit Card");
    }

    public void processRefund() {
        System.out.println("amount" + " " + this.amount + " " + " is Refunded in your bank account");
    }
}

class DebitCardPayment extends Payment {
    private double amount;

    public DebitCardPayment(double amount) {
        super(amount);
        this.amount = amount;
    }

    public void pay() {
        System.out.println("debited amount of  " + " " + this.amount + " " + "rupees via Debit Card");
    }
}

class UPIPayment extends Payment implements Refundable {
    private double amount;

    public UPIPayment(double amount) {
        super(amount);
        this.amount = amount;
    }

    public void pay() {
        System.out.println("paid amount of " + " " + this.amount + " " + "rupees via UPI PAYMENT");
    }

    public void processRefund() {
        System.out.println("amount" + " " + this.amount + " " + " is Refunded in your bank account ");
    }
}

class Gateway {
    public static void main(String[] args) {
        CreditCardPayment Credit = new CreditCardPayment(2500);
        Credit.pay();
        Credit.processRefund();

        DebitCardPayment Debit = new DebitCardPayment(4505.45);
        Debit.pay();

        UPIPayment UPI = new UPIPayment(1500);
        UPI.pay();
        UPI.processRefund();
    }
}