import java.util.Scanner;
class As12 {            
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 4-digit number: ");
        int number = sc.nextInt();
        // Ensure the number is 4 digits
        if (number < 1000 || number > 9999) {
            System.out.println("Please enter a valid 4-digit number.");
            return;
        }
        int reversedNumber = 0;
        // Reverse the digits of the number
        while (number != 0) {
            int digit = number % 10; // Get the last digit
            reversedNumber = reversedNumber * 10 + digit; // Append it to the reversed number
            number /= 10; // Remove the last digit from the original number
        }
        System.out.println("Reversed number is: " + reversedNumber);
    }
}