// Problem 2: Employee Management System 

// Abstract class Employee:

// id, name, salary fields

// abstract method calculateSalary()

// concrete method showDetails()

// Subclasses:

// FullTimeEmployee (salary = fixed monthly)

// PartTimeEmployee (salary = hourly * rate)

// Intern (stipend based)

// Interface BonusEligible with method giveBonus().

// Only FullTimeEmployee and PartTimeEmployee should implement BonusEligible.

// In main class, create employees and calculate salary + bonus

import java.util.*;

interface BonusEligible {
    public void giveBonus(double amount);
}

abstract class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    abstract void calculateSalary();

    public void showDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: rs " + salary);
    }
}

class FullTimeEmployee extends Employee implements BonusEligible {
    private double monthlySalary;

    public FullTimeEmployee(int id, String name, double monthlySalary) {
        super(id, name);
        this.monthlySalary = monthlySalary;
    }

    public void calculateSalary() {
        setSalary(monthlySalary);
    }

    public void giveBonus(double amount) {
        setSalary(getSalary() + amount);
        System.out.println(getName() + " received a bonus of rs " + amount);
    }
}

class PartTimeEmployee extends Employee implements BonusEligible {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int id, String name, int hoursWorked, double hourlyRate) {
        super(id, name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public void calculateSalary() {
        setSalary(hoursWorked * hourlyRate);
    }

    public void giveBonus(double amount) {
        setSalary(getSalary() + amount);
        System.out.println(getName() + " received a bonus of rs " + amount);
    }
}

class Intern extends Employee {
    private double stipend;

    public Intern(int id, String name, double stipend) {
        super(id, name);
        this.stipend = stipend;
    }

    public void calculateSalary() {
        setSalary(stipend);
    }
}

class EmployeeManagementSystem {
    public static void main(String[] args) {
        FullTimeEmployee e1 = new FullTimeEmployee(1, "Ravi", 40000);
        PartTimeEmployee e2 = new PartTimeEmployee(2, "Neha", 80, 250);
        Intern e3 = new Intern(3, "Siddhi", 10000);

        e1.calculateSalary();
        e2.calculateSalary();
        e3.calculateSalary();

        e1.giveBonus(5000);
        e2.giveBonus(2000);

        System.out.println(" Employee Details:- ");
        e1.showDetails();
        e2.showDetails();
        e3.showDetails();
    }
}
