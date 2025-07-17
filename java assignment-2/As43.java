import java.util.Scanner;
class As43 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height of cone (in cm):");
        double height = sc.nextDouble();
        System.out.println("Enter slant height of cone (in cm):");
        double slantHeight = sc.nextDouble();
        System.out.println("Enter rate per sq. cm:");
        double rate = sc.nextDouble();
        // r^2 = l^2 - h^2
        double radius = Math.sqrt(slantHeight * slantHeight - height * height);
        double baseArea = Math.PI * radius * radius;
        double cost = baseArea * rate;
        System.out.println("Cost of polishing the base: Rs. " + cost);
    }
}

