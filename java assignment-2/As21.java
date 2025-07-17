import java.util.Scanner;
 class As21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of bricks: ");
        double length = sc.nextDouble();
        System.out.println("Enter breadth of bricks: ");
        double breadth = sc.nextDouble();
        System.out.println("Enter height of bricks: ");
        double height = sc.nextDouble();
        double Vbrick = length * breadth * height;
        System.out.println("Volume of brick:"+Vbrick);
        System.out.println("Enter length of wall: ");
        double wallLength = sc.nextDouble();
        System.out.println("Enter breadth of wall: ");
        double wallBreadth = sc.nextDouble();
        System.out.println("Enter height of wall: ");
        double wallHeight = sc.nextDouble();
        double Vwall = wallLength * wallBreadth * wallHeight;
        double totalbricks= Vwall / Vbrick;
        System.out.println("Total number of bricks required to build the wall: " + totalbricks);
    }

}
