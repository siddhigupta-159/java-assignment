// 8. Checked vs Unchecked Exception

//  Write a program with a method that throws IOException (checked) and another that throws ArithmeticException (unchecked). Show the difference in compiler behavior.

import java.io.IOException;

class Testmain {
    // Checked Exception
    static void checkedMethod() throws IOException {
        throw new IOException("This is a checked exception");
    }

    // Unchecked Exception
    static void uncheckedMethod() {
        throw new ArithmeticException("This is an unchecked exception");
    }

    public static void main(String[] args) {
        // Handling checked exception
        try {
            checkedMethod();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Caught checked exception: " + e);
        }finally{
            System.out.println("finally executed....");
        }
        uncheckedMethod();
        System.out.println("After unchecked exception");
    }
}