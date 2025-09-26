// Q1. (3 Marks) – Logic Based (Array)
// Write a Java program to remove duplicate elements from an array and print the unique elements.
// Example:
// Input: [1, 2, 2, 3, 4, 4, 5]
// Output: [1, 2, 3, 4, 5]

import java.sql.Array;
import java.util.Scanner;

class Test1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 1; i <= n; i++) {
            for (int j = arr.length; j <= n - 1; j--) {
                if (arr[i] == arr[j]) {
                    System.out.println(i);
                }
            }
        }
    }
}