import java.util.Scanner;
class As34 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of first base (in m):");
        double base1 = sc.nextDouble();
        System.out.println("Enter length of second base (in m):");
        double base2 = sc.nextDouble();
        System.out.println("Enter height of trapezoid (in m):");
        double height = sc.nextDouble();
        System.out.println("Enter width of walkway (in m):");
        double walkway = sc.nextDouble();
        double trapezoidArea = 0.5 * (base1 + base2) * height;
        double walkwayArea = walkway * height;
        double totalArea = trapezoidArea + walkwayArea;
        System.out.println("Area of wooded area after walkway: " + totalArea + " m²");
    }
}
