// 9. Online Library System
// A student is trying to issue more books than the limit (say, 3).
// Should you handle it wih a business rule check or by throwing a custom exception MaxBooksIssuedException?
// Justify your answer.

import java.util.Scanner;

class MaxBooksIssuedException extends RuntimeException {
    MaxBooksIssuedException(String message) {
        super(message);
    }
}

class Testmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxBooks = 3;
        System.out.print("How many books do you want to issue? ");
        int requestedBooks = sc.nextInt();

        try {
            if (requestedBooks > maxBooks) {
                throw new MaxBooksIssuedException(
                        "Cannot issue more than " + maxBooks + " books!");
            }
            System.out.println("Books issued successfully: " + requestedBooks);
        } catch (MaxBooksIssuedException e) {
            e.printStackTrace();
            System.out.println("Friendly message: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}
