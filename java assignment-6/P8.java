// Q.8 Given an unsorted array arr[] of size N having both negative and positive integers. The task is place all negative element at the end of array without changing the order of positive element and negative element.

// Example 1:
// Input : 
// N = 8
// arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }
// Output : 
// 1  3  2  11  6  -1  -7  -5

// Example 2:
// Input : 
// N=8
// arr[] = {-5, 7, -3, -4, 9, 10, -1, 11}
// Output :
// 7  9  10  11  -5  -3  -4  -1

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

        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for (int x : arr) {
            if (x >= 0)
                pos.add(x);
            else
                neg.add(x);
        }

        pos.addAll(neg);

        System.out.println("Rearranged Array:");
        for (int x : pos)
            System.out.print(x + " ");
    }
}
