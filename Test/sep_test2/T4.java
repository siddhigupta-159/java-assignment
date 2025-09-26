//  4. Method Overloading Problem
//  Problem: Area Calculator

// Create a class AreaCalculator with overloaded methods:

// calculateArea(int side) → returns the area of a square.

// calculateArea(int length, int breadth) → returns the area of a rectangle.

// calculateArea(double radius) → returns the area of a circle.
// In main(), demonstrate all three methods.

class AreaCalculator {
    public int calculateArea(int side) {
        return side * side;
    }

    public int calculateArea(int length, int breadth) {
        return 2 * (length + breadth);
    }

    public double calculateArea(double radius) {
        return 2 * 3.14 * radius;
    }

    public void getAreaSquare(){
        System.out.println("Area of Square: "+calculateArea(5));
    }

    public void getAreaReactangle() {
        System.out.println("Area of Reactangle :" + calculateArea(10, 15));
    }

    public void getAreaRadius() {
        System.out.println("Area of Radius:" + calculateArea(2.5));
    }
}

class Testmain {
    public static void main(String args[]) {

        AreaCalculator b = new AreaCalculator();
        b.getAreaSquare();
        b.getAreaReactangle();
        b.getAreaRadius();

    }
}
