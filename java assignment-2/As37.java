import java.util.Scanner;
 class As37 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter surface area of cylinder (in cm²):");
        double surfaceArea = sc.nextDouble();
        System.out.println("Enter height of cylinder (in cm):");
        double height = sc.nextDouble();
        // Surface area = 2 * pi * r * (r + h)
        // Rearranged: 2 * pi * r^2 + 2 * pi * r * h - surfaceArea = 0
        // Quadratic: a = 2*pi, b = 2*pi*h, c = -surfaceArea
        double a = 2 * Math.PI;
        double b = 2 * Math.PI * height;
        double c = -surfaceArea;
        double discriminant = b * b - 4 * a * c;
        if (discriminant < 0) {
            System.out.println("No real solution for radius.");
        } else {
            double r = (-b + Math.sqrt(discriminant)) / (2 * a);
            double diameter = 2 * r;
            System.out.println("Diameter of cylinder: " + diameter + " cm");
        }
    }
}

