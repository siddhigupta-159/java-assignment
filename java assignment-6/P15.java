// Q.15 Sub with equal 0s and 1s
// Given an array containing 0s and 1s. Find the number of subarrays having equal number of 0s and 1s. 
// Example 1:
// Input:
// n = 7
// A[] = {1,0,0,1,0,1,1}
// Output: 8
// Explanation: The index range for the 8 
// sub-arrays are: (0, 1), (2, 3), (0, 3), (3, 4), 
// (4, 5) ,(2, 5), (0, 5), (1, 6)

import java.util.*;

class Testmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter 0s and 1s:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        // Replace 0 by -1
        for (int i = 0; i < n; i++)
            if (arr[i] == 0)
                arr[i] = -1;

        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0, count = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == 0)
                count++;
            if (map.containsKey(sum))
                count += map.get(sum);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        System.out.println("Number of subarrays with equal 0s and 1s = " + count);
    }
}
