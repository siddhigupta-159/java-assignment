// Q.7 Sub array with given sum
// Given an unsorted array A of size N that contains only non-negative integers,
//  find a continuous sub-array which adds to a given number S.

class Testmain {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int k = 9; // the array elements which sum is 9
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                if (k == sum) {
                    System.out.println(i + " " + j);
                }
                if (sum > k) {
                    break;
                }

            }
        }
    }
}

// import java.util.Scanner;

// class P6 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the size of array");
// int n = sc.nextInt();
// int arr[] = { n };
// System.out.println("Enter the no of Array");
// int k = 9; // the array elements which sum is 9
// int sum = 0;
// for (int i = 0; i < arr.length; i++) {
// for (int j = i; j < arr.length; j++) {
// sum = sum + arr[j];
// if (k == sum) {
// System.out.println(i + " " + j);
// }
// if (sum > k) {
// break;
// }

// }
// }
// }
// }