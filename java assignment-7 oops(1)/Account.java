 // Bank Account
// Create a class BankAccount with fields: accountNumber, holderName, balance.
// Use setters to assign values. Add a method to display balance

class Fields {
    private int accountNumber;
    private String holderName;
    private double balance;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }
}

class Account {
    public static void main(String argd[]) {
        Fields obj = new Fields();
        obj.setAccountNumber(377810442);
        obj.setHolderName("Siddhi gupta");
        obj.setBalance(2563.45);
        obj.display();
    }
}