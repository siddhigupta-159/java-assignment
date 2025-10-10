// 5. Multiple Catch Blocks
// 👉 Take two integers and perform division. 
//     Handle both ArithmeticException and InputMismatchException separately.

import java.util.Scanner;
import java.util.InputMismatchException;

class Testmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter 1st value");
            int a = sc.nextInt();

            System.out.println("Enter 2nd value");
            int b = sc.nextInt();
            
            int c = a / b;
            System.out.println("Result : " + c);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught....");
            System.out.println("Denominator can't be zero | please re-try");
        } catch (InputMismatchException e) {
            System.out.println(" InputMismatchException caught....");
            System.out.println("Only Integers are allowed...");
        } finally {
            sc.close();
        }
    }
}