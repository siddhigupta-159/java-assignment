// 30. Suppose A, B, C are arrays of integers of size M, N, and M + N respectively. The numbers in array A appear in ascending order while the numbers in array B appear in descending order. Write a java progtam to produce third array C by merging arrays A and B in ascending order.

import java.util.*;

class Testmain {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Input for first array A (ascending order)
        System.out.print("Enter size of array A: ");
        int m = sc.nextInt();
        int A[] = new int[m];
        System.out.println("Enter elements of array A (ascending order):");
        for (int i = 0; i < m; i++) {
            A[i] = sc.nextInt();
        }

        // Input for second array B (descending order)
        System.out.print("Enter size of array B: ");
        int n = sc.nextInt();
        int B[] = new int[n];
        System.out.println("Enter elements of array B (descending order):");
        for (int i = 0; i < n; i++) {
            B[i] = sc.nextInt();
        }

        // Reverse array B to make it ascending
        for (int i = 0; i < n / 2; i++) {
            int temp = B[i];
            B[i] = B[n - i - 1];
            B[n - i - 1] = temp;
        }

        // Merge A and reversed B into C
        int C[] = new int[m + n];
        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (A[i] <= B[j]) {
                C[k++] = A[i++];
            } else {
                C[k++] = B[j++];
            }
        }

        while (i < m) {
            C[k++] = A[i++];
        }
        while (j < n) {
            C[k++] = B[j++];
        }

        // Print merged array C
        System.out.println("Merged array C in ascending order:");
        for (int x = 0; x < C.length; x++) {
            System.out.print(C[x] + " ");
        }
    }
}
