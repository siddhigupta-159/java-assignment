import java.util.Scanner;
class As11 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter area of triangle (in m²):");
        double area = sc.nextDouble();
        System.out.println("Enter base ratio:");
        double baseRatio = sc.nextDouble();
        System.out.println("Enter height ratio:");
        double heightRatio = sc.nextDouble();
        double x = Math.sqrt((2 * area) / (baseRatio * heightRatio));
        double base = baseRatio * x;
        double height = heightRatio * x;
        System.out.println("Base of triangle: " + base + " m");
        System.out.println("Height of triangle: " + height + " m");
    }
}
