// 4. Write a Java program to create a class called "Circle" with a radius attribute. You can access and modify this attribute. 
// Calculate the area and circumference of the circle.

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
        radius = 0;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        double Area = 3.14 * radius * radius;
        return Area;
    }

    public double calculateCircumference() {
        double Circumference = 2 * 3.14 * radius;
        return Circumference;
    }
}

class P4 {
    public static void main(String[] args) {
        Circle obj1 = new Circle();
        Circle obj2 = new Circle();
        obj1.setRadius(3.3);
        double A = obj1.calculateArea();
        System.out.println("Area is:" + A);
        double C = obj1.calculateCircumference();
        System.out.println("Circumference is:" + C);
        obj2.setRadius(4.5);
        double Ar = obj2.calculateArea();
        System.out.println("Area is:" + Ar);
        double Cr = obj2.calculateCircumference();
        System.out.println("Circumference is:" + Cr);

    }
}