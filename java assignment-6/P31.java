// 31. Suppose X. Y, Z are arrays of integers of size M, N, and M + N respectively. The numbers in array X and Y appear in descending order. Write a java program to produce third array Z by merging arrays X and Y in descending order.

import java.util.*;

class Testmain {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Input for first array X
        System.out.print("Enter size of array X: ");
        int m = sc.nextInt();
        int X[] = new int[m];
        System.out.println("Enter elements of array X (descending order):");
        for (int i = 0; i < m; i++) {
            X[i] = sc.nextInt();
        }

        // Input for second array Y
        System.out.print("Enter size of array Y: ");
        int n = sc.nextInt();
        int Y[] = new int[n];
        System.out.println("Enter elements of array Y (descending order):");
        for (int i = 0; i < n; i++) {
            Y[i] = sc.nextInt();
        }

        // Merge arrays
        int Z[] = new int[m + n];
        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (X[i] >= Y[j]) {
                Z[k] = X[i];
                i++;
            } else {
                Z[k] = Y[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements from X
        while (i < m) {
            Z[k] = X[i];
            i++;
            k++;
        }

        // Copy remaining elements from Y
        while (j < n) {
            Z[k] = Y[j];
            j++;
            k++;
        }

        // Print the merged array
        System.out.println("Merged array Z in descending order:");
        for (int z = 0; z < Z.length; z++) {
            System.out.print(Z[z] + " ");
        }
    }
}
