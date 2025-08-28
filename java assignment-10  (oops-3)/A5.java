// question-17 = Create a class Employee with(empNo ,salary and totalSalary) with following
//   features.
//   Only parameterized constructor;
//   totalSalary always represent total of all the salaries of all employees
//   created.
//   empNo should be auto incremented.
//   display total employees and totalSalary using class method.
 
import java.util.Scanner;

class Employee {
    private static int empCounter = 0;
    private static double totalSalary = 0.0;

    int empNo;
    double salary;

    public Employee(double salary) {
        this.empNo = ++empCounter;
        this.salary = salary;
        totalSalary += salary;
    }

    public static void display() {
        System.out.println("Total Employees: " + empCounter);
        System.out.println("Total Salary: " + totalSalary);
    }

}

class TestMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter salary for employee " + (i + 1) + ": ");
            double salary = sc.nextDouble();
            new Employee(salary);
        }

        Employee.display();
    }
}
