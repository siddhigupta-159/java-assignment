// 3. Exception Handling Problem #2
//  Problem: Age Validator

// Ask the user for their age.

// If the age is less than 18 or greater than 100, throw a custom exception InvalidAgeException.

// Catch the exception and display "Invalid age entered".

// If valid, print "Age accepted: <age>".
import java.io.IOException;
import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }

}

class Testmain {
    public static void main(String ags[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();

        try {
            if (age < 18 && age > 100) {
                throw new InvalidAgeException(" Invalid age entered..");
            } else {
                System.out.println("Age accepted : " + age);
            }
        } catch (InvalidAgeException e) {
            System.out.println(" Invalid age entered..");
        }

    }
}