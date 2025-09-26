//  2. Exception Handling Problem #1
//  Problem: Division Calculator

// Write a program that:

// Takes two integers as input.

// Performs division and handles ArithmeticException if the denominator is zero.

// Use a finally block to print "Program Completed".

// Sample Input/Output:

// Input: 10 0  
// Output: Cannot divide by zero  
// Program Completed

class Testmain {
    public static void main(String args[]) {
        int a = 10;
        int b = 0;
        try {
            int c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero...");
        } finally {
            System.out.println(" Program Completed");
        }
    }
}