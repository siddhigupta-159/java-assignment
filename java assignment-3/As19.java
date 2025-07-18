import java.util.Scanner;
class As19 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first variable: ");
        int a = sc.nextInt();
        System.out.println("Enter the second variable: ");
        int b = sc.nextInt();
        // With third variable
        int c= a;
        a = b;
        b = c;
        System.out.println("After exchanging with third variable: a = " + a + ", b = " + b);
        // Without third variable
        a = a + b; // Now a contains the sum of both variables
        b = a - b; // Now b contains the original value of a
        a = a - b; // Now a contains the original value of b
        System.out.println("After exchanging without third variable: a = " + a + ", b = " + b);
    }
}