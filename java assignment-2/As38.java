import java.util.Scanner;
class As38 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter volume of cylinder:");
        double volume = sc.nextDouble();
        System.out.println("Enter radius of base:");
        double radius = sc.nextDouble();
        // Volume = pi * r^2 * h => h = volume / (pi * r^2)
        double height = volume / (Math.PI * radius * radius);
        double surfaceArea = 2 * Math.PI * radius * (radius + height);
        System.out.println("Surface area of cylinder: " + surfaceArea);
    }
}
