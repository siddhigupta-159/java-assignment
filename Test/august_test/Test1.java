// Q1. (3 Marks)
// Write a Java program to check whether a given number is prime or not.
// Input: 29
// Output: 29 is a prime number.

import java.util.Scanner;

class Test1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println(n + " number is prime ");
        } else
            System.out.println(n + " number is not prime");
    }
}
