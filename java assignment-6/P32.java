// 32. Given two arrays of integers A and B of sizes M and N respectively. Write a Write a java program, which will produce a third array named C. such that the following sequence is followed. 
// All even numbers of A from left to right are copied into C from left to right. 
// All odd numbers of A from left to right are copied into C from right to left. 
// All even numbers of B from left to right are copied into C from left to right. 
// All old numbers of B from left to right are copied into C from right to left.
// e.g., A is {3, 2, 1, 7, 6, 3} and B is {9, 3, 5, 6, 2, 8, 10} the resultant array C is {2, 6, 6, 2, 8, 10, 5, 3, 9, 3, 7, 1, 3}

import java.util.*;

class Testmain {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Input for first array A
        System.out.print("Enter size of array A: ");
        int m = sc.nextInt();
        int A[] = new int[m];
        System.out.println("Enter elements of array A:");
        for (int i = 0; i < m; i++) {
            A[i] = sc.nextInt();
        }

        // Input for second array B
        System.out.print("Enter size of array B: ");
        int n = sc.nextInt();
        int B[] = new int[n];
        System.out.println("Enter elements of array B:");
        for (int i = 0; i < n; i++) {
            B[i] = sc.nextInt();
        }

        int sizeC = m + n;
        int C[] = new int[sizeC];

        // Two pointers: left for start, right for end
        int left = 0;
        int right = sizeC - 1;

        // Step 1: Copy all even numbers of A (left to right)
        for (int i = 0; i < m; i++) {
            if (A[i] % 2 == 0) {
                C[left] = A[i];
                left++;
            }
        }

        // Step 2: Copy all odd numbers of A (right to left)
        for (int i = 0; i < m; i++) {
            if (A[i] % 2 != 0) {
                C[right] = A[i];
                right--;
            }
        }

        // Step 3: Copy all even numbers of B (left to right)
        for (int i = 0; i < n; i++) {
            if (B[i] % 2 == 0) {
                C[left] = B[i];
                left++;
            }
        }

        // Step 4: Copy all odd numbers of B (right to left)
        for (int i = 0; i < n; i++) {
            if (B[i] % 2 != 0) {
                C[right] = B[i];
                right--;
            }
        }

        // Output the resultant array
        System.out.println("Resultant array C is:");
        for (int i = 0; i < sizeC; i++) {
            System.out.print(C[i] + " ");
        }
    }
}
