import java.util.Scanner;
 class As20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of brick: ");
        double length = sc.nextDouble();
        System.out.println("Enter breadth of brick: ");
        double breadth = sc.nextDouble();
        System.out.println("Enter height of brick: ");
        double height = sc.nextDouble();
        double Vbrick = length * breadth * height;
        System.out.println("Volume of brick:"+Vbrick);
    }

}
