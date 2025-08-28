// question -13 =  Create a class to calculate Area of circle with one data member to store
// the radius and another to store area value. Create method members
// init - to input radius from user
// calc - to calculate area
// display- to display area

import java.util.Scanner;

class Circle {
    double radius;
    double area;

    public Circle() {
        this.radius = radius;
        this.area = area;
    }

    public void init() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        radius = sc.nextDouble();
    }

    public void calc() {
        area = 2*3.14 * radius * radius;
    }

    public void display() {
        System.out.println("The area of the circle with radius is : " + area);
    }
}

class TestMain {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.init();
        circle.calc();
        circle.display();
    }
}