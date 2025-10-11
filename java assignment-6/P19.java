// Q.19) Find Maximum product contigeous sub array 

// Given an array Arr[] that contains N integers (may be positive, negative or zero). Find the product of the maximum product subarray.
// Example 1:
// Input:
// N = 5
// Arr[] = {6, -3, -10, 0, 2}
// Output: 180
// Explanation: Subarray with maximum product
// is [6, -3, -10] which gives product as 180.

import java.util.*;

class Testmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int maxProd = arr[0];
        int minProd = arr[0];
        int result = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] < 0) {
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }
            maxProd = Math.max(arr[i], maxProd * arr[i]);
            minProd = Math.min(arr[i], minProd * arr[i]);
            result = Math.max(result, maxProd);
        }

        System.out.println("Maximum product subarray = " + result);
    }
}
