// question-20 =  Create class Tile to store the edge length of a square tile , and create
//   another class Floor to store length and width of a rectangular floor. Add
//   method totalTiles(Tile t) in Floor class with Tile as argument to calculate
//   the whole number of tiles needed to cover the floor completely.
 
import java.util.Scanner;
import java.lang.Math;

class Tile {
    double edgeLength;

    public Tile(double edgeLength) {
        this.edgeLength = edgeLength;
    }

    public double area() {
        return edgeLength * edgeLength;
    }
}

class Floor {
    double length;
    double width;

    public Floor(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }

    public int totalTiles(Tile t) {
        double floorArea = this.area();
        double tileArea = t.area();
        return (int) Math.ceil(floorArea / tileArea);
    }
}

class TestMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the floor: ");
        double length = sc.nextDouble();
        System.out.print("Enter the width of the floor: ");
        double width = sc.nextDouble();
        Floor floor = new Floor(length, width);

        System.out.print("Enter the edge length of the tile: ");
        double edgeLength = sc.nextDouble();
        Tile tile = new Tile(edgeLength);

        int totalTiles = floor.totalTiles(tile);
        System.out.println("Total number of tiles needed to cover the floor: " + totalTiles);
    }
}
