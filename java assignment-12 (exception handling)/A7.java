// 7. Custom Exception
// 👉Create your own exception InvalidAgeException.If age<18,throw the exception.
// class InvalidAgeException extends Exception {
//     InvalidAgeException(String msg) {
//         super(msg);
//     }
// }
// Test in main:
// if(age<18)throw new InvalidAgeException("Not eligible for voting");

import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String msg) {
        super(msg);
    }
}

class Testmain {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age");
        int age = sc.nextInt();
        try {
            if (age < 18)
                throw new InvalidAgeException("Not eligible for voting");
            else {
                System.out.println("You can vote..");
            }
        } catch (InvalidAgeException e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }
}
