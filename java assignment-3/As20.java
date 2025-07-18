import java.util.Scanner;
class As20 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first variable: ");
        int a = sc.nextInt();
        System.out.println("Enter the second variable: ");
        int b = sc.nextInt();
        // Exchanging values without using a third variable or arithmetic operators
        a = a ^ b; // Step 1: XOR operation
        b = a ^ b; // Step 2: Get original value of a
        a = a ^ b; // Step 3: Get original value of b
 System.out.println("After exchanging: a = " + a + ", b = " + b);
    }
}