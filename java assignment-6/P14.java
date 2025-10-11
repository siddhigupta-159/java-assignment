// Q.14. Find the first non-repeating elment in given array of integers
// Find the first non-repeating element in a given array arr of N integers.
// Note: Array consists of only positive and negative integers and not zero.
// Example 1:
// Input : arr[] = {-1, 2, -1, 3, 2}
// Output : 3
// Explanation:
// -1 and 2 are repeating whereas 3 is 
// the only number occuring once.
// Hence, the output is 3.

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

        Map<Integer, Integer> freq = new LinkedHashMap<>();
        for (int x : arr)
            freq.put(x, freq.getOrDefault(x, 0) + 1);

        int ans = 0;
        for (int x : freq.keySet()) {
            if (freq.get(x) == 1) {
                ans = x;
                break;
            }
        }

        if (ans != 0)
            System.out.println("First non-repeating element: " + ans);
        else
            System.out.println("No non-repeating element found.");
    }
}
