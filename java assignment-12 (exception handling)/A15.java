// 5. ATM PIN Validation
// If the user enters a wrong PIN 3 times, throw a custom exception AccountLockedException.
// Which exception handling mechanism will you use?
// Should it be checked (force the programmer to handle) or unchecked?

import java.util.Scanner;

class AccountLockedException extends RuntimeException {
    AccountLockedException(String message) {
        super(message);
    }
}

class Testmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctPin = "1234";
        int attempts = 0;

        while (attempts < 3) {
            System.out.print("Enter your ATM PIN: ");
            String pin = sc.nextLine();

            if (pin.equals(correctPin)) {
                System.out.println("PIN correct. Access granted!");
                break;
            } else {
                attempts++;
                System.out.println("Wrong PIN. Attempts left: " + (3 - attempts));
            }

            if (attempts == 3) {
                throw new AccountLockedException("Account locked due to 3 wrong PIN attempts!");
            }
        }

        System.out.println("Program ended.");
    }
}
