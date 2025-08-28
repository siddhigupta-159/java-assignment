// question-15 =  Create a class MathOperation containing method ‘multiply’ to calculate
//   multiplication of following arguments.
//  * two integers
//  * three float
//  * all elements of array
//  * one double and one integer


import java.util.Scanner;

class MathOperation {

    public MathOperation() {
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public float multiply(float a, float b, float c) {
        return a * b * c;
    }

    public int multiply(int[] arr) {
        int result = 1;
        for (int num : arr) {
            result *= num;
        }
        return result;
    }

    public double multiply(double a, int b) {
        return a * b;
    }
}

class TestMain {
    public static void main(String[] args) {
        MathOperation mathOp = new MathOperation();

        int intResult = mathOp.multiply(3, 4);
        System.out.println("Multiplication of two integers (3, 4): " + intResult);

        float floatResult = mathOp.multiply(2.5f, 3.0f, 4.0f);
        System.out.println("Multiplication of three floats (2.5, 3.0, 4.0): " + floatResult);

        int[] arr = { 1, 2, 3, 4 };
        int arrayResult = mathOp.multiply(arr);
        System.out.println("Multiplication of all elements in array {1, 2, 3, 4}: " + arrayResult);

        double doubleResult = mathOp.multiply(5.5, 2);
        System.out.println("Multiplication of one double (5.5) and one integer (2): " + doubleResult);
    }
}
