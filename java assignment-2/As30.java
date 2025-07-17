import java.util.Scanner;
class As30 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of tile (in cm):");
        int tileLength = sc.nextInt();
        System.out.println("Enter breadth of tile (in cm):");
        int tileBreadth = sc.nextInt();
        System.out.println("Enter length of floor (in cm):");
        int floorLength = sc.nextInt();
        System.out.println("Enter width of floor (in cm):");
        int floorWidth = sc.nextInt();
        int tileArea = tileLength * tileBreadth;
        int floorArea = floorLength * floorWidth;
        int numTiles = (int)Math.ceil((double)floorArea / tileArea);
        System.out.println("Number of tiles required: " + numTiles);
    }
}
