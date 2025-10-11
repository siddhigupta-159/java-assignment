// Q.17 Find it there is any subarray with sum equals to zero
// Given an array of positive and negative numbers. Find if there is a subarray (of size at-least one) with 0 sum.
// Example 1:
// Input:
// 5
// 4 2 -3 1 6

// Output: 
// Yes

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
        int sum = 0;
        boolean found = false;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == 0 || set.contains(sum) || arr[i] == 0) {
                found = true;
                break;
            }
            set.add(sum);
        }

        if (found)
            System.out.println("Yes, subarray with sum 0 exists.");
        else
            System.out.println("No subarray with sum 0.");
    }
}
