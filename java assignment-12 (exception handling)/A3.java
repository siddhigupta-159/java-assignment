// 3. ArrayIndexOutOfBoundsException

// 👉 Create an array of size 5. Ask the user for an index and print the element. Handle the case when the index is out of range.

// // Expected
// Enter index: 8
// java.lang.ArrayIndexOutOfBoundsException caught

import java.util.Scanner;

class Testmain {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 10, 20, 30, 40, 50 };
        System.out.println("enter index");
        try {
            int index = sc.nextInt();
            System.out.println("element of index:" + " " + index + ": " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("java.lang.ArrayIndexOutOfBoundsException caught");
        } finally {
            sc.close();
        }
    }
}
