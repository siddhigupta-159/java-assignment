import java.util.Scanner;
class As35 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of cylinder (in cm):");
        double radius = sc.nextDouble();
        System.out.println("Enter height of cylinder (in cm):");
        double height = sc.nextDouble();
        double surfaceArea = 2 * Math.PI * radius * (radius + height);
        System.out.println("Surface area of cylinder: " + surfaceArea + " cm²");
    }
}
