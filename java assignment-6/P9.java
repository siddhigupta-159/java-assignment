// Q.9 Find the Union and Intersaction of two sorted array.
// Given two arrays a[] and b[] of size n and m respectively. The task is to find union between these two arrays. 
// Union of the two arrays can be defined as the set containing distinct elements from both the arrays. If there are repetitions, then only one occurrence of element should be printed in the union.
// Example 1:
// Input:
// 5 3
// 1 2 3 4 5
// 1 2 3
// Output: 
// 5
// Explanation: 
// 1, 2, 3, 4 and 5 are the
// elements which comes in the union set
// of both arrays. So count is 5.
// Example 2:
// Input:
// 6 2 
// 85 25 1 32 54 6
// 85 2 
// Output: 
// 7
// Explanation: 
// 85, 25, 1, 32, 54, 6, and
// 2 are the elements which comes in the
// union set of both arrays. So count is 7.

import java.util.*;

class Testmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements (sorted):");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        System.out.print("Enter size of second array: ");
        int m = sc.nextInt();
        int b[] = new int[m];
        System.out.println("Enter elements (sorted):");
        for (int i = 0; i < m; i++)
            b[i] = sc.nextInt();

        Set<Integer> union = new HashSet<>();
        Set<Integer> inter = new HashSet<>();

        for (int x : a)
            union.add(x);
        for (int x : b) {
            if (union.contains(x))
                inter.add(x);
            else
                union.add(x);
        }

        System.out.println("Union elements: " + union);
        System.out.println("Intersection elements: " + inter);
    }
}
