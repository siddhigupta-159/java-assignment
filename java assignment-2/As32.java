import java.util.Scanner;
class As32 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side length of garden (in m):");
        double gardenSide = sc.nextDouble();
        System.out.println("Enter side length of swimming pool (in m):");
        double poolSide = sc.nextDouble();
        double gardenArea = gardenSide * gardenSide;
        double poolArea = poolSide * poolSide;
        double areaWithoutPool = gardenArea - poolArea;
        System.out.println("Area of garden excluding pool: " + areaWithoutPool + " m²");
    }
}

