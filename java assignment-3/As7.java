import java.util.Scanner;
class As7 { 
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of classes held: ");
        double classesHeld = sc.nextDouble();
        System.out.println("Enter the number of classes attended: ");
        double classesAttended = sc.nextDouble();
        double attendancePercentage = (double) (classesAttended / classesHeld) * 100;
        System.out.println("Attendance percentage is: " + attendancePercentage + "%");
        if (attendancePercentage < 75) {
            System.out.println(" A Student is not allowed to sit in the exam.");
        } else {
            System.out.println("A Student is allowed to sit in the exam.");
        }
    }
}   