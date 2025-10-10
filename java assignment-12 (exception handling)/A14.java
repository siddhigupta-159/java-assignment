// 4. E-commerce Discount Calculation
// Suppose you are dividing total amount by quantity to get per item price. If quantity = 0, what happens?
// Which exception will occur?
// How will you ensure the program continues and doesn’t stop execution?

import java.util.Scanner;

class Testmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total amount: ");
        int totalAmount = sc.nextInt();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        try {
            int perItemPrice = totalAmount / quantity;
            System.out.println("Per item price: " + perItemPrice);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println(" Error: Quantity cannot be zero. Please enter a valid quantity.");
        }finally{
            sc.close();
        }
    }
}
