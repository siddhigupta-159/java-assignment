import java.util.Scanner;
class As44 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter your choice (+, >, ==): ");
        char choice = sc.next().charAt(0);
        switch (choice) {
            case '+':
                int sum = num1 + num2;
                System.out.println("The sum is: " + sum);
                break;
            case '>':
                if (num1 > num2) {
                    System.out.println(num1 + " is greater than " + num2);
                } else if (num2 > num1) {
                    System.out.println(num2 + " is greater than " + num1);
                } else {
                    System.out.println("Both numbers are equal.");
                }
                break;
            case '=':
                if (num1 == num2) {
                    System.out.println("Both numbers are equal.");
                } else {
                    System.out.println("Numbers are not equal.");
                }
                break;
            default:
                System.out.println("Invalid choice! Please enter +, >, or ==");
        }
    }
}