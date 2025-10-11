// Q.5 Find the kth largest and kth smallest element in array.

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

        Arrays.sort(arr);

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        int kthSmallest = arr[k - 1];
        int kthLargest = arr[n - k];

        System.out.println("kth Smallest = " + kthSmallest);
        System.out.println("kth Largest = " + kthLargest);
    }
}
