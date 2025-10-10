// 3. Write a Java program to create a class called "Rectangle" with width and height attributes. 
// Calculate the area and perimeter of the rectangle.

class Rectangle {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public Rectangle() {
        height = width = 0;
    }

    public void setHieght(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calculateArea() {
        double Area = this.height * this.width;
        return Area;
    }

    public double calculatePerimeter() {
        double Perimeter = 2 * (this.height + this.width);
        return Perimeter;
    }
}

class P3 {
    public static void main(String[] args) {
        Rectangle obj1 = new Rectangle();
        Rectangle obj2 = new Rectangle();
        obj1.setHieght(4.5);
        obj1.setWidth(5);
        double A = obj1.calculateArea();
        System.out.println("Area is: " + A);
        double P = obj1.calculatePerimeter();
        System.out.println("Perimeter is: " + P);
        obj2.setHieght(6.4);
        obj2.setWidth(6);
        double Ar = obj2.calculateArea();
        System.out.println("Area is: " + Ar);
        double Pr = obj2.calculatePerimeter();
        System.out.println("Perimeter is: " + Pr);
    }
}
