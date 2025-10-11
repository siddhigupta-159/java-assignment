// Q.20 Longest consecutive sequence.
// Given an array of positive integers. Find the length of the longest sub-sequence such that elements in the subsequence are consecutive integers, the consecutive numbers can be in any order.
//  
// Example 1:
// Input:
// N = 7
// a[] = {2,6,1,9,4,5,3}
// Output:
// 6

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

        Set<Integer> set = new HashSet<>();
        for (int x : arr)
            set.add(x);

        int longest = 0;
        for (int x : set) {
            if (!set.contains(x - 1)) {
                int curr = x;
                int length = 1;
                while (set.contains(curr + 1)) {
                    curr++;
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }

        System.out.println("Length of longest consecutive sequence = " + longest);
    }
}
