// Q.22) Java program to find nearest lesser and greater element in array
// Given an array of N elements and we have to find nearest lesser and nearest greater element using C program.
// Example:
//     Input:
//     Enter the number of elements for the arrray : 3  
 
//     Enter the elements for array_1.. 
//     array_1[0] : 1   
//     array_1[1] : 2   
//     array_1[2] : 3   
 
//     Enter the number : 2 
 
//     Output:
//     Element lesser than 2 is : 1 
//     Element greater than 2 is : 3

import java.util.*;

class Testmain {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Input for array
        System.out.print("Enter number of elements for the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter elements for array:");
        for (int i = 0; i < n; i++) {
            System.out.print("array[" + i + "] : ");
            arr[i] = sc.nextInt();
        }

        // Input the number to check
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int lesser = Integer.MIN_VALUE;
        int greater = Integer.MAX_VALUE;

        // Find nearest lesser and greater elements
        for (int i = 0; i < n; i++) {
            if (arr[i] < num && arr[i] > lesser) {
                lesser = arr[i];
            }
            if (arr[i] > num && arr[i] < greater) {
                greater = arr[i];
            }
        }

        if (lesser != Integer.MIN_VALUE) {
            System.out.println("Element lesser than " + num + " is : " + lesser);
        } else {
            System.out.println("No element lesser than " + num);
        }

        if (greater != Integer.MAX_VALUE) {
            System.out.println("Element greater than " + num + " is : " + greater);
        } else {
            System.out.println("No element greater than " + num);
        }
    }
}
