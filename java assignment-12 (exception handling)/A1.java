// 1. Divide by Zero Exception

// 👉 Write a program that takes two numbers from the user and divides them. Handle the case where the second number is zero.

// // Expected
// Enter first number: 10
// Enter second number: 0
// java.lang.ArithmeticException caught: / by zero

import java.util.Scanner;

class Testmain {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st value");
        int a = sc.nextInt();

        System.out.println("Enter 2nd value");
        int b = sc.nextInt();
        try {
            int c = a / b;
            System.out.println("Result : " + c);
        } catch (ArithmeticException e) {
            System.out.println("Exception Caught...");
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }
}
