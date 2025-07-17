import java.util.Scanner;
class As25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of the bricks: ");
        double length = scanner.nextDouble();
        System.out.print("Enter breadth of the bricks: ");
        double breadth = scanner.nextDouble();
        System.out.print("Enter number of the bricks: ");
        double NoBricks = scanner.nextDouble();
        double patharea = (length * breadth)/NoBricks;
        System.out.println("Area of the path: " + patharea + " square meters");
    }
}
