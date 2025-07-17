import java.util.Scanner;
class As19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of cuboid: ");
        double length = sc.nextDouble();
        System.out.println("Enter breadth of cuboid: ");
        double breadth = sc.nextDouble();
        System.out.println("Enter height of cuboid: ");
        double height = sc.nextDouble();
        double Vcuboid =length*breadth*height;
        System.out.println("Volume of cuboid:"+Vcuboid);
        System.out.println("Enter LENGTH of cube: ");
        double LENGTH = sc.nextDouble();
        double Vcube = LENGTH * LENGTH * LENGTH;
        System.out.println("Volume of cube:"+Vcube);
    }

}
