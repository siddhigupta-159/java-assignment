// Employee Record System Create a
// class Employee with private fields:id,name,
// and salary.
// Use setter
// methods to
// assign values.
// Add a
// method to
// display employee details.

class Record {
    private int id;
    private String name;
    private double salary;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}

class Employee {
    public static void main(String[] args) {
        Record obj = new Record();
        obj.setId(12);
        obj.setName("siddhi");
        obj.setSalary(30000);
        obj.display();
    }
}
