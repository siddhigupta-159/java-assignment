// Q.4 Write a program to sort the array

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

        Arrays.sort(arr);
        System.out.println("Sorted Array:");
        for (int x : arr)
            System.out.print(x + " ");
    }
}
