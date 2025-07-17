import java.util.Scanner; class As24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of brick: ");
        double length = scanner.nextDouble();
        System.out.print("Enter thickness of brick: ");
        double thick = scanner.nextDouble();
        System.out.print("Enter height of brick: ");
        double height = scanner.nextDouble();
        double volume = length * thick * height;
        System.out.println("Volume of brick: " + volume);
        System.out.print("Enter length of wall: ");
        double wallLength = scanner.nextDouble();
        System.out.print("Enter thickness of wall: ");
        double wallThick = scanner.nextDouble();
        System.out.print("Enter height of wall: ");
        double wallHeight = scanner.nextDouble();
        double totalBricks = (wallLength * wallThick * wallHeight) / volume;
        System.out.println("Total number of bricks that can fit: " + totalBricks);
        double cost=(totalBricks/1000)*900;
        System.out.println("Total cost: " + cost);
        }
}
