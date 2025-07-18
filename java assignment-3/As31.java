import java.util.Scanner;
class As31 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 'C' to convert Fahrenheit to Celsius or 'F' to convert Celsius to Fahrenheit: ");
        char choice = sc.next().charAt(0);
        if (choice == 'C' || choice == 'c') {
            System.out.println("Enter temperature in Fahrenheit: ");
            double fahrenheit = sc.nextDouble();
            double celsius = (fahrenheit - 32) * 5 / 9;
            System.out.println("Temperature in Celsius: " + celsius);
        } else if (choice == 'F' || choice == 'f') {
            System.out.println("Enter temperature in Celsius: ");
            double celsius = sc.nextDouble();
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        } else {
            System.out.println("Invalid choice. Please enter 'C' or 'F'.");
        }
    }
}   