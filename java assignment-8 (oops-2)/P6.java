// 6. Write a Java program to create a class called "Employee" with a name, job title, 
// and salary attributes, and methods to calculate and update salary.

class Employee {
    private String name, job_title;
    private int salary;

    public Employee(String name, String job, int salary) {
        this.name = name;
        this.job_title = job;
        this.salary = salary;
    }

    public void getDetails() {
        System.out.println(" Name : " + this.name + " " + " Job Title : " + this.job_title + " Salary: " + this.salary);
    }

    public void updateSalary(int salary) {
        this.salary += salary;
        System.out.println("Salary Incremented..., \n new salary: " + this.salary);

    }

    public void decrementSalary(int salary) {
        this.salary -= salary;
        System.out.println("Salary decremented..., \n new salary: " + this.salary);

    }

    public void setSalary(int salary) {
        this.salary = salary;

    }
}

class P6 {
    public static void main(String[] args) {
        Employee Siddhi = new Employee("Siddhi", "Senior developer", 25000);
        Siddhi.getDetails();
        Siddhi.updateSalary(40000);
        Siddhi.getDetails();
        Siddhi.decrementSalary(20000);
        Siddhi.getDetails();

    }
}