// 6. Finally Block Practice

// 👉 Open a Scanner, read an input, and always close the scanner in finally (show that finally always executes).

import java.util.InputMismatchException;
import java.util.Scanner;

class Testmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("enter a number");
            int a = sc.nextInt();
            System.out.println("number: " + a);
        } catch (InputMismatchException e) {
            e.printStackTrace();
            System.out.println("InputMismatchException caught....");
            System.out.println("only integers are allowed");
        } finally {
            System.out.println("always exicuted finally...");
            sc.close();
        }
    }
}