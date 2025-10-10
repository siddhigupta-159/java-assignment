// 2. InputMismatchException

// 👉 Ask the user to enter an integer. If the user enters text instead, catch the exception.

// // Expected
// Enter an integer: abc
// java.util.InputMismatchException caught

import java.util.Scanner;
import java.util.InputMismatchException;

class Testmain {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter 1st value");
            int a = sc.nextInt();

            System.out.println("Enter 2nd value");
            int b = sc.nextInt();

            int c = a / b;
            System.out.println("Result : " + c);
        } catch (InputMismatchException e) {
            e.printStackTrace();
            System.out.println("Only Integers are allowed...");
        } finally {
            sc.close();
        }
    }
}
