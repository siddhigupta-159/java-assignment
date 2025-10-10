// question-3 -WAP to program calaculate the sum of all even element and all odd element of array

import java.util.Scanner;
class As3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int evenSum = 0;
        int oddSum = 0;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evenSum += arr[i];
            } else {
                oddSum += arr[i];
            }
        }
        
        System.out.println("The sum of all even elements in the array is: " + evenSum);
        System.out.println("The sum of all odd elements in the array is: " + oddSum);
    }
}   