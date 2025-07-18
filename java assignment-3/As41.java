import java.util.Scanner;
class As41 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks for Physics: ");
        int physics = sc.nextInt();
        System.out.println("Enter marks for Chemistry: ");
        int chemistry = sc.nextInt();
        System.out.println("Enter marks for Biology: ");
        int biology = sc.nextInt();
        System.out.println("Enter marks for Mathematics: ");
        int mathematics = sc.nextInt();
        System.out.println("Enter marks for Computer: ");
        int computer = sc.nextInt();
        // Calculate total and percentage
        int totalMarks = physics + chemistry + biology + mathematics + computer;
        double percentage = (totalMarks / 5.0);
        // Determine grade
        String grade;
        if (percentage >= 90) {
            grade = "A";
        } else if (percentage >= 80) {
            grade = "B";
        } else if (percentage >= 70) {
            grade = "C";
        } else if (percentage >= 60) {
            grade = "D";
        } else if (percentage >= 40) {
            grade = "E";
        } else {
            grade = "F";
        }
        // Output results
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }
}   