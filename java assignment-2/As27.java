import java.util.Scanner;
class As27 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of dining room (in m):");
        double length = sc.nextDouble();
        System.out.println("Enter width of dining room (in m):");
        double width = sc.nextDouble();
        System.out.println("Enter rate per square meter:");
        double rate = sc.nextDouble();
        double area = length * width;
        double cost = area * rate;
        System.out.println("Total cost of tiling: $" + cost);
    }
}


