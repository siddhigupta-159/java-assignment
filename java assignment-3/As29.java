import java.util.Scanner;
class As29 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter third number: ");
        int num3 = sc.nextInt();
        System.out.println("Enter fourth number: ");
        int num4 = sc.nextInt();
        int lowest = num1; // Assume first number is the lowest initially
        if (num2 < lowest) {
            lowest = num2;
        }
        if (num3 < lowest) {
            lowest = num3;
        }
        if (num4 < lowest) {
            lowest = num4;
        }
        System.out.println("The lowest number among the four is: " + lowest);
    }
}