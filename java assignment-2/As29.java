import java.util.Scanner;
class As29 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter side of square tile (in cm):");
        int tileSide = sc.nextInt();
        System.out.println("Enter length of floor (in cm):");
        int floorLength = sc.nextInt();
        System.out.println("Enter width of floor (in cm):");
        int floorWidth = sc.nextInt();
        int tileArea = tileSide * tileSide;
        int floorArea = floorLength * floorWidth;
        int numTiles = (int)Math.ceil((double)floorArea / tileArea);
        System.out.println("Number of tiles required: " + numTiles);
    }
}

       