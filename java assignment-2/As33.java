import java.util.Scanner;
 class As33 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of garden (in m):");
        double length = sc.nextDouble();
        System.out.println("Enter width of garden (in m):");
        double width = sc.nextDouble();
        System.out.println("Enter width of first pathway (in m):");
        double path1 = sc.nextDouble();
        System.out.println("Enter width of second pathway (in m):");
        double path2 = sc.nextDouble();
        double totalArea = length * width;
        double pathArea = (path1 * width) + (path2 * length) - (path1 * path2);
        double usableArea = totalArea - pathArea;
        System.out.println("Usable area of garden: " + usableArea + " m²");
    }
}
