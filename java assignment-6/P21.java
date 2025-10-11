// Q.21 Max Sum in configuration

// Given an array(0-based indexing), you have to find the max sum of i*A[i] where A[i] is the element at index i in the array.The only operation allowed is to rotate(clock-wise or counter clock-wise) the array any number of times.

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

        // Step 1: Calculate sum of all elements
        int arrSum = 0;
        for (int i = 0; i < n; i++) {
            arrSum += arr[i];
        }

        // Step 2: Calculate initial configuration sum (i*A[i])
        int currVal = 0;
        for (int i = 0; i < n; i++) {
            currVal += i * arr[i];
        }

        int maxVal = currVal;

        // Step 3: Compute sum for all rotations
        for (int i = 1; i < n; i++) {
            currVal = currVal + arrSum - n * arr[n - i];
            if (currVal > maxVal) {
                maxVal = currVal;
            }
        }

        System.out.println("Maximum sum of i*A[i] after rotations: " + maxVal);
    }
}
