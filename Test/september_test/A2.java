// ⚠ 2. Exception Handling Problem

// Bank Withdrawal Simulation

// Create a custom exception InsufficientFundsException.

// Create a class BankAccount with fields: accountNumber, balance.

// Add a withdraw(double amount) method that:

// Throws InsufficientFundsException if the amount > balance.

// Deducts the amount otherwise.

// In main, create an account, attempt withdrawals, and handle the exception gracefully.

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount {
    String accountNumber;
    double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Withdrawal failed: Insufficient funds.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful: " + amount + " withdrawn.");
        }
    }

    public void displayBalance() {
        System.out.println("Account " + accountNumber + " balance: " + balance);
    }
}

class Testmain {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("SBIN0002837", 5000.00);
        BankAccount account2 = new BankAccount("SBIN0002837", 12000.00);
        account1.displayBalance();
        account2.displayBalance();

        try {
            account1.withdraw(3000.00);
            account1.displayBalance();

            account2.withdraw(8000.00);
            account2.displayBalance();

            account1.withdraw(2500.00);

        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        account1.displayBalance();
    }
}
