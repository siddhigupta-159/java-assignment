// write a Java program to create a class called "Employee" with a name, salary, 
// and hire date attributes, and a method to calculate years of service.

class Employee {
    private String name;
    private double salary;
    private int year;

    public Employee(String name, double salary, int year) {
        this.name = name;
        this.salary = salary;
        this.year = year;
    }

    public void getDetails() {
        System.out.println("Employee name:" + name + " " + "salary:" + salary + " " + "year:" + year);
    }

    public int Calculateyear() {
        int totalyear = 2025 - this.year;
        return totalyear;
    }
}

class P9 {
    public static void main(String[] args) {
        Employee year1 = new Employee("siddhi", 2000000, 2014);
        int service1 = year1.Calculateyear();
        System.out.println("Total Year Of Service:" + service1);
        Employee year2 = new Employee("suryansh", 150000, 2016);
        int service2 = year2.Calculateyear();
        System.out.println("Total Year Of Service:" + service2);
    }
}
