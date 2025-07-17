import java.util.Scanner;
class As31 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter perimeter of square (in m):");
        double perimeter = sc.nextDouble();
        double side = perimeter / 4;
        double area = side * side;
        System.out.println("Area of square: " + area + " m²");
    }
}
