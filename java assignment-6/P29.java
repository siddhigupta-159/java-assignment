// 29. Suppose a one-dimensional array AR containing integers is arranged in ascending order. Write a java program to search for an integer from AR with the help of Binary search method,

import java.util.*;

class Testmain {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Input for array AR
        System.out.print("Enter size of array AR: ");
        int n = sc.nextInt();
        int AR[] = new int[n];

        System.out.println("Enter elements of array AR in ascending order:");
        for (int i = 0; i < n; i++) {
            AR[i] = sc.nextInt();
        }

        // Input the element to search
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int low = 0, high = n - 1;
        boolean found = false;

        // Binary search logic
        while (low <= high) {
            int mid = (low + high) / 2;

            if (AR[mid] == key) {
                System.out.println("Element found at index: " + mid);
                found = true;
                break;
            } else if (AR[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (!found) {
            System.out.println("Element not found!");
        }
    }
}
