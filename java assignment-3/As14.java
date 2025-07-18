import java.util.Scanner;
class As14 {        
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        int marks = sc.nextInt();
        String grade;
        if (marks > 90) {
            grade = "A";
        } else if (marks > 80 && marks <= 90) {
            grade = "B";
        } else if (marks >= 60 && marks <= 80) {
            grade = "C";
        } else {
            grade = "D";
        }
        System.out.println("Your grade is: " + grade);
    }
}   