// question-14 =   Create a class MathOperation with two data member X and Y to store the
//   operand and third data member R to store result of operation.Create method members
//   init - to input X and Y from user
//   add - to add X and Y and store in R
//   multiply - to multiply X and Y and store in R
//   power - to calculate X Y and store in R
//   display- to display Result R


import java.util.Scanner;

class MathOperation {
    double X;
    double Y;
    double R;

    public MathOperation() {
        this.X = X;
        this.Y = Y;
        this.R = R;
    }

    public void init() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of X: ");
        X = sc.nextDouble();
        System.out.print("Enter the value of Y: ");
        Y = sc.nextDouble();
    }

    public void add() {
        R = X + Y;
    }

    public void multiply() {
        R = X * Y;
    }

    public void power() {
        R = Math.pow(X, Y);
    }

    public void display() {
        System.out.println("The result is: " + R);
    }
}

class TestMain {
    public static void main(String[] args) {
        MathOperation mathOp = new MathOperation();
        mathOp.init();

        mathOp.add();
        System.out.print("After addition, ");
        mathOp.display();

        mathOp.multiply();
        System.out.print("After multiplication, ");
        mathOp.display();

        mathOp.power();
        System.out.print("After exponentiation, ");
        mathOp.display();
    }
}
