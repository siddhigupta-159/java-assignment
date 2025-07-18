import java.util.Scanner;
class As28{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        double area = Math.PI * radius * radius; // Area = π * r^2
        System.out.println("The area of the circle is: " + area);
    }
}