
// Write a Java program to create a class called "Bank" with a collection of accounts and 
// methods to add and remove accounts, and to deposit and withdraw money. 
// Also define a class called "Account" to maintain account details of a particular customer.
import java.util.ArrayList;

class Bank {
    ArrayList<Account> ac = new ArrayList<Account>();

    public void AddAccount(Account a) {
        ac.add(a);
    }

    public void removeAccount(Account a) {
        ac.remove(a);
    }

    public void display() {
        for (Account account : ac) {
            System.out.println(account.getDetails());

        }
    }

}

class Account {
    private String name, account_number;
    private int amount;

    public Account() {
    }

    public Account(String name, String account_number, int amount) {
        this.name = name;
        this.account_number = account_number;
        this.amount = amount;
    }

    public String getDetails() {
        return this.name + " " + this.account_number + " " + this.amount;
    }

    public void Deposit(int amount) {
        this.amount += amount;
    }

    public void Withdraw(int amount) {
        if (this.amount >= amount) {
            this.amount -= amount;
            System.out.println("Withdrawel Successfull...");
        } else {
            System.out.println(" Insufficient Balance...");
        }
        System.out.println("Available balance " + this.amount);
    }

}

class P7 {
    public static void main(String[] args) {
        Account Siddhi = new Account("Siddhi", " 123", 20000);
        Account Suryansh = new Account("Suryansh", "456", 10000);
        Account Saneha = new Account("Saneha", "789", 200);
        Bank bk = new Bank();
        bk.AddAccount(Saneha);
        bk.AddAccount(Suryansh);
        bk.AddAccount(Siddhi);
        Suryansh.Deposit(500);
        Suryansh.getDetails();
        Suryansh.Withdraw(200);
        Suryansh.getDetails();
        bk.display();
        bk.removeAccount(Saneha);
        bk.display();

    }
}