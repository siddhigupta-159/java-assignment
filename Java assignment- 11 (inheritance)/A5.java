// Problem 4: Banking System 

// Abstract class BankAccount:

// accountNumber, balance fields

// abstract methods: deposit(), withdraw()

// concrete method showBalance()

// Subclasses:

// SavingsAccount (cannot withdraw below ₹1000)

// CurrentAccount (no min balance required)

// Interface LoanEligible with method checkLoanEligibility().

// Only SavingsAccount is loan eligible.

import java.util.*;

interface LoanEligible {
    public void checkLoanEligibility();
}

abstract class BankAccount {
    private int accountNumber;
    private double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    abstract void deposit(double amount);

    abstract void withdraw(double amount);

    public void showBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: rs " + balance);
    }
}

class SavingsAccount extends BankAccount implements LoanEligible {

    public SavingsAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("rs " + amount + " deposited successfully into Savings Account.");
    }

    public void withdraw(double amount) {
        if (getBalance() - amount >= 1000) {
            setBalance(getBalance() - amount);
            System.out.println("rs " + amount + " withdrawn successfully from Savings Account.");
        } else {
            System.out.println(" Withdrawal denied! Minimum balance rs 1000 must be maintained.");
        }
    }

    public void checkLoanEligibility() {
        if (getBalance() >= 5000) {
            System.out.println(" You are eligible for a loan.");
        } else {
            System.out.println(" You are not eligible for a loan. Maintain at least rs 5000 balance.");
        }
    }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("rs " + amount + " deposited successfully into Current Account.");
    }

    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println("rs " + amount + " withdrawn successfully from Current Account.");
        } else {
            System.out.println(" Insufficient balance in Current Account.");
        }
    }
}

class BankingSystem {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(1001, 4000);
        CurrentAccount ca = new CurrentAccount(2001, 10000);

        System.out.println(" Banking System Simulation :- ");

        System.out.println(" Savings Account:- ");
        sa.showBalance();
        sa.deposit(2000);
        sa.withdraw(2500);
        sa.showBalance();
        sa.checkLoanEligibility();

        System.out.println(" Current Account:- ");
        ca.showBalance();
        ca.deposit(5000);
        ca.withdraw(12000);
        ca.withdraw(8000);
        ca.showBalance();
    }
}
