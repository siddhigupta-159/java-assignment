// Circle Geometry
// Create a class Circle with field radius.
// Use a setter to assign radius. Add methods to compute area and circumference.

class Field {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public void display() {
        System.out.println("Circle Radius: " + radius);
        System.out.println("Circle Area: " + calculateArea());
        System.out.println("Circle Circumference: " + calculateCircumference());
    }
}

class Circle {
    public static void main(String[] args) {
        Field obj = new Field();
        obj.setRadius(3.3);
        obj.calculateArea();
        obj.calculateCircumference();
        obj.display();
    }
}
