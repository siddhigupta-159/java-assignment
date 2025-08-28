// question- 5 = Create an Object having two properties and four behaviours
//  (add,substract,multiply,divide) to perform desired operation.object must have
//setter and getter and keep all properties private.

import java.util.Scanner;

class Calculator {
    private double num1;
    private double num2;

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double add() {
        return num1 + num2;
    }

    public double subtract() {
        return num1 - num2;
    }

    public double multiply() {
        return num1 * num2;
    }

    public double divide() {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: Division by zero");
            return 0;
        }
    }
}

class TestMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Enter first number: ");
        calc.setNum1(sc.nextDouble());
        System.out.print("Enter second number: ");
        calc.setNum2(sc.nextDouble());

        System.out.println("Addition: " + calc.add());
        System.out.println("Subtraction: " + calc.subtract());
        System.out.println("Multiplication: " + calc.multiply());
        System.out.println("Division: " + calc.divide());
    }
}
