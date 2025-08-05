// Rectangle Area Calculator
// Create a class Rectangle with fields: length, width.
// Use setters to assign values. Add a method to calculate area.
class Fields {
    private double length;
    private double width;

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public void display() {
        System.out.println("Rectangle Length: " + length);
        System.out.println("Rectangle Width: " + width);
        System.out.println("Rectangle Area: " + calculateArea());
    }
}

class Rectanle {
    public static void main(String[] args) {
        Fields obj = new Fields();
        obj.setLength(4.5);
        obj.setWidth(4.5);
        obj.calculateArea();
        obj.display();
    }
}
