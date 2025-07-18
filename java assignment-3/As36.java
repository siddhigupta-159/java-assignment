import java.util.Scanner;
class As36 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three angles of the triangle: ");
        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();
        int angle3 = sc.nextInt();
        if (angle1 + angle2 + angle3 == 180) {
            System.out.println("The triangle is valid.");
        } else {
            System.out.println("The triangle is not valid.");
        }
    }
}