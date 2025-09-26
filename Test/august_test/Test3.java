// Q3. (4 Marks)
// Write a Java program using OOP concepts:
// Create a class Student with attributes: name, marks.
// Create a method getGrade() that returns:
// "A" if marks ≥ 80
// "B" if marks ≥ 60 and < 80
// "C" if marks ≥ 40 and < 60
// "F" if marks < 40
// Create main() method to create 3 students and print their name with grade.

class Student {
    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public void getdetails() {
        System.out.print("name:" + name + " " + "grade: " + " ");
    }

    public void getGrade() {
        if (marks >= 80) {
            System.out.println("A");
        } else if (marks >= 60 && marks < 80) {
            System.out.println("B");
        } else if (marks >= 40 && marks < 60) {
            System.out.println("C");
        } else if (marks < 40) {
            System.out.println("F");
        } else {
            System.out.println("fail");
        }
    }
}

class Test3 {
    public static void main(String args[]) {
        Student A1 = new Student("Siddhi", 85);
        Student A2 = new Student("Suryansh", 40);
        Student A3 = new Student("Sneha", 18);
        A1.getdetails();
        A1.getGrade();
        A2.getdetails();
        A2.getGrade();
        A3.getdetails();
        A3.getGrade();
    }
}