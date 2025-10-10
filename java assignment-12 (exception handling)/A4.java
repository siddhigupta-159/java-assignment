//  4. NullPointerException

// 👉Declare a String=null.Try to call length()on it.Handle the exception.

// // Expected
// java.lang.NullPointerException caught

import java.util.Scanner;

class Testmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = null;
        try {
            System.out.println("length of the string: " + str.length());
        } catch (java.lang.NullPointerException e) {
            e.printStackTrace();
            System.out.println("java.lang.NullPointerException caught....");
        } finally {
            sc.close();
        }
    }
}
