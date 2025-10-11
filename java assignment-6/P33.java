// 33. Write a java program to impelment binary search algorithm

import java.util.*;

class Testmain {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements (sorted order): ");
        int n = sc.nextInt();

        int a[] = new int[n];
        System.out.println("Enter elements in ascending order:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int low = 0, high = n - 1;
        boolean found = false;

        // Binary Search logic
        while (low <= high) {
            int mid = (low + high) / 2;

            if (a[mid] == key) {
                System.out.println("Element found at index: " + mid);
                found = true;
                break;
            } else if (a[mid] < key) {
                low = mid + 1; // search in right half
            } else {
                high = mid - 1; // search in left half
            }
        }

        if (!found) {
            System.out.println("Element not found!");
        }
    }
}
