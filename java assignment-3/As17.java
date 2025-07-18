import java.util.Scanner;
class As17 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.println("Enter the width of the rectangle: ");
        double width = sc.nextDouble();
        double area = length * width; // Area = length * width
        System.out.println("The area of the rectangle is: " + area);
    }
}