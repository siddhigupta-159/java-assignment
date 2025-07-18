import java.util.Scanner;
class As8{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of classes held: ");
        double classesHeld = sc.nextDouble();
        System.out.println("Enter the number of classes attended: ");
        double classesAttended = sc.nextDouble();
        double attendancePercentage = (double) (classesAttended / classesHeld) * 100;
        System.out.println("Attendance percentage is: " + attendancePercentage + "%");
        System.out.println("Do you have a medical cause? (Y/N): ");
        char hasMedicalCause = sc.next().charAt(0);
        if (attendancePercentage < 75 && hasMedicalCause != 'Y' && hasMedicalCause != 'y') {
            System.out.println("A Student is not allowed to sit in the exam.");
        } else {
            System.out.println("A Student is allowed to sit in the exam.");
        }
    }
}