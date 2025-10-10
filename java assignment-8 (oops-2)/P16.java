// 16. Write a Java program to create a class called "Shape" with abstract methods for 
// calculating area and perimeter, and subclasses for "Rectangle", "Circle", and "Triangle".

abstract class Shape {
    abstract double area();

    abstract double perimeter();
}

class Rectangle extends Shape {
    double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }

    double perimeter() {
        return 2 * (length + width);
    }
}

class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return 3.14 * radius * radius;
    }

    double perimeter() {
        return 2 * 3.14 * radius;
    }
}

class Triangle extends Shape {
    double a, b, c; // sides

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double area() {
        double s = (a + b + c) / 2; // semi-perimeter
        return Math.sqrt(s * (s - a) * (s - b) * (s - c)); // Heron's formula
    }

    double perimeter() {
        return a + b + c;
    }
}

class P16 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 4);
        Circle c = new Circle(3);
        Triangle t = new Triangle(3, 4, 5);

        System.out.println("Rectangle Area: " + r.area());
        System.out.println("Rectangle Perimeter: " + r.perimeter());

        System.out.println("Circle Area: " + c.area());
        System.out.println("Circle Perimeter: " + c.perimeter());

        System.out.println("Triangle Area: " + t.area());
        System.out.println("Triangle Perimeter: " + t.perimeter());
    }
}
