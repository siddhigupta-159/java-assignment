// 3. Online Exam System
// A student enters their roll number (integer), but by mistake they enter "abc".
// Which exception will occur?
// How can you catch it and ask them to re-enter?

import java.util.InputMismatchException;
import java.util.Scanner;

class Testmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int roll = 0;
        boolean valid = false;

        while (!valid) {
            try {
                System.out.print("Enter Roll Number: ");
                roll = sc.nextInt(); //
                valid = true;
            } catch (InputMismatchException e) {
                e.printStackTrace();
                System.out.println("Invalid input! Please enter numbers only.");
            }
        }
        System.out.println("Roll Number entered: " + roll);
    }
}