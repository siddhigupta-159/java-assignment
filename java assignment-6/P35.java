// 35. Write a java program to implement selection sort algoritm

import java.util.*;

class Testmain {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int a[] = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Selection Sort Logic
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // assume the first element is smallest
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j; // update index of smaller element
                }
            }
            // Swap smallest element with a[i]
            int temp = a[minIndex];
            a[minIndex] = a[i];
            a[i] = temp;
        }

        System.out.println("Array after Selection Sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
