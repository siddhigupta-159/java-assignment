import java.util.Scanner;
 class As26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of path: ");
        double length = scanner.nextDouble();    //convert meter to cm
        length = length * 100; // convert to cm
        System.out.print("Enter breadth of path: ");
        double breadth = scanner.nextDouble();
        breadth = breadth * 100; // convert to cm
        double Area = length * breadth;
        System.out.println("Area of path: " + Area);
        System.out.print("Enter length of bricks: ");
        double BricksLength = scanner.nextDouble();
        System.out.print("Enter width of bricks: ");
        double BricksWidth = scanner.nextDouble();
        double AreaBricks = (BricksLength * BricksWidth);
        double NoBricks = Area / AreaBricks;
        System.out.println("Number of bricks required: " + NoBricks);
    }
    
}
