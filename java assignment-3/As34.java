import java.util.Scanner;
class As34 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lengths of the three sides of the triangle: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if (a == b && b == c) {
            System.out.println("The triangle is equilateral.");
        } else if (a == b || b == c || a == c) {
            System.out.println("The triangle is isosceles.");
        } else {
            System.out.println("The triangle is scalene.");
        }
    }
}   