import java.util.Scanner;
class As42 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the basic salary of the employee: ");
        double basicSalary = sc.nextDouble();
        double hra, da, grossSalary;
        if (basicSalary <= 10000) {
            hra = 0.20 * basicSalary; // HRA = 20%
            da = 0.80 * basicSalary; // DA = 80%
        } else if (basicSalary <= 20000) {
            hra = 0.25 * basicSalary; // HRA = 25%
            da = 0.90 * basicSalary; // DA = 90%
        } else {
            hra = 0.30 * basicSalary; // HRA = 30%
            da = 0.95 * basicSalary; // DA = 95%
        }
        grossSalary = basicSalary + hra + da;
        System.out.println("The gross salary of the employee is: " + grossSalary);
    }
}