
// Q.1 Peak an element

// An element is called a peak element if its value is not smaller than the value of its adjacent elements(if they exists).
// Given an array arr[] of size N, find the index of any one of its peak elements.
// Note: The generated output will always be 1 if the index that you return is correct. Otherwise output will be 0.

// Example 1:
// Input:
// N = 3
// arr[] = {1,2,3}
// Output: 1
// Explanation: index 2 is 3.
// It is the peak element as it is 
// greater than its neighbour 2.
// Example 2:
// Input:
// N = 2
// arr[] = {3,4}
// Output: 1
// Explanation: 4 (at index 1) is the 
// peak element as it is greater than 
// its only neighbour element 3.
// Constraints:
// 1 ≤ N ≤ 105
// 1 ≤ A[] ≤ 106

import java.util.*;

class Testmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int peakIndex = findPeak(arr, n);
        System.out.println("Peak element is at index: " + peakIndex);
    }

    static int findPeak(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            boolean leftOk = (i == 0) || (arr[i] >= arr[i - 1]);
            boolean rightOk = (i == n - 1) || (arr[i] >= arr[i + 1]);
            if (leftOk && rightOk)
                return i;
        }
        return -1;
    }
}
