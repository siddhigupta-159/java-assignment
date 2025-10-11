// Q.12 Find common elements in three sorted arrays.
// Given three arrays sorted in increasing order. Find the elements that are common in all three arrays.
// Note: can you take care of the duplicates without using any additional Data Structure?
// Example 1:
// Input:
// n1 = 6; A = {1, 5, 10, 20, 40, 80}
// n2 = 5; B = {6, 7, 20, 80, 100}
// n3 = 8; C = {3, 4, 15, 20, 30, 70, 80, 120}
// Output: 20 80
// Explanation: 20 and 80 are the only
// common elements in A, B and C.

import java.util.*;

class Testmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int a[] = new int[n1];
        System.out.println("Enter elements:");
        for (int i = 0; i < n1; i++)
            a[i] = sc.nextInt();

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int b[] = new int[n2];
        System.out.println("Enter elements:");
        for (int i = 0; i < n2; i++)
            b[i] = sc.nextInt();

        System.out.print("Enter size of third array: ");
        int n3 = sc.nextInt();
        int c[] = new int[n3];
        System.out.println("Enter elements:");
        for (int i = 0; i < n3; i++)
            c[i] = sc.nextInt();

        int i = 0, j = 0, k = 0;
        System.out.print("Common elements: ");
        while (i < n1 && j < n2 && k < n3) {
            if (a[i] == b[j] && b[j] == c[k]) {
                System.out.print(a[i] + " ");
                i++;
                j++;
                k++;
            } else if (a[i] < b[j])
                i++;
            else if (b[j] < c[k])
                j++;
            else
                k++;
        }
    }
}
