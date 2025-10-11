// Q.11 Count pair with given sum.
// Given an array of N integers, and an integer K, find the number of pairs of elements in the array whose sum is equal to K.

// Example 1:
// Input:
// N = 4, K = 6
// arr[] = {1,5,7,1}
// Output: 2
// Explanation: 
// arr[0] + arr[1] = 1 + 5 = 6 
// and arr[1] + arr[3] = 5 + 1 = 6.

import java.util.*;

class Testmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.print("Enter sum value (K): ");
        int k = sc.nextInt();

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == k)
                    count++;
            }
        }

        System.out.println("Number of pairs with sum " + k + " = " + count);
    }
}
