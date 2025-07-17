import java.util.Scanner;
class As28 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of carpet (in m):");
        double length = sc.nextDouble();
        System.out.println("Enter width of carpet (in m):");
        double width = sc.nextDouble();
        System.out.println("Enter rate per square meter:");
        double rate = sc.nextDouble();
        double area = length * width;
        double price = area * rate;
        System.out.println("Total price of carpet: $" + price);
    }
}
