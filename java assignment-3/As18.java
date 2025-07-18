import java.util.Scanner;
class As18 {
     public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of students: ");
        double totalStudents = sc.nextDouble();
        System.out.println("Enter the number of students who passed: ");
        double studentsPassed = sc.nextDouble();
        double percentagePassed = (studentsPassed / totalStudents) * 100;
        System.out.println("Percentage of students who passed: " + percentagePassed + "%");
        if (percentagePassed < 50) {
            System.out.println("Less than 50% of students passed.");
        } else {
            System.out.println("50% or more students passed.");
        }
    }
}   