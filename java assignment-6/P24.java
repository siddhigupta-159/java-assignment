// 24. Write a Java program to swap first and last element of an integer 1-d array.

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

        // Swap first and last element
        if (n > 1) { // Check if array has more than 1 element
            int temp = arr[0];
            arr[0] = arr[n - 1];
            arr[n - 1] = temp;
        }

        // Print modified array
        System.out.println("Array after swapping first and last elements:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
