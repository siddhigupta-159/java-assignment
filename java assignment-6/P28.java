// 28. P is one-dimensional array of integers. Write a Java program search for a data VAL from P. If VAL is present in the array then “element found ” otherwise “element not found” should be displayed.

import java.util.*;

class Testmain {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Input for array P
        System.out.print("Enter size of array P: ");
        int n = sc.nextInt();
        int P[] = new int[n];

        System.out.println("Enter elements of array P:");
        for (int i = 0; i < n; i++) {
            P[i] = sc.nextInt();
        }

        // Input the element VAL to search
        System.out.print("Enter element VAL to search: ");
        int VAL = sc.nextInt();

        boolean found = false;

        // Linear search logic
        for (int i = 0; i < n; i++) {
            if (P[i] == VAL) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
    }
}
