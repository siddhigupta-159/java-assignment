// 23. Write a Java program to find the sum and average of one dimensional integer array.

import java.util.*;

class Testmain {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Input for array
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Calculate sum
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        // Calculate average
        double avg = (double) sum / n;

        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + avg);
    }
}
