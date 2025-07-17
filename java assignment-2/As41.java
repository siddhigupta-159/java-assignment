import java.util.Scanner;
class As41 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter diameter of cylinder (in cm):");
        double diameter = sc.nextDouble();
        System.out.println("Enter height of cylinder (in cm):");
        double height = sc.nextDouble();
        double radius = diameter / 2.0;
        double volume = Math.PI * radius * radius * height;
        System.out.println("Volume of cylinder: " + volume + " cm³");
    }
}

