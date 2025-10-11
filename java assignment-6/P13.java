// Q.13  Find the first repeating element in array of integers

import java.util.*;

class Testmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        Set<Integer> set = new HashSet<>();
        int repeating = -1;
        for (int i = 0; i < n; i++) {
            if (set.contains(arr[i])) {
                repeating = arr[i];
                break;
            } else {
                set.add(arr[i]);
            }
        }

        if (repeating != -1)
            System.out.println("First repeating element: " + repeating);
        else
            System.out.println("No repeating element found.");
    }
}
