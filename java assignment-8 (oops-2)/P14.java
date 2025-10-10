// Write a Java program to create a class called "School" with attributes for students, teachers, 
// and classes, and methods to add and remove students and teachers, and to create classes.

import java.util.ArrayList;

import java.util.ArrayList;

class School {
    ArrayList<String> students = new ArrayList<String>();
    ArrayList<String> teachers = new ArrayList<String>();
    ArrayList<String> classList = new ArrayList<String>();

    public void addStudent(String name) {
        students.add(name);
    }

    public void removeStudent(String name) {
        students.remove(name);
    }

    public void addTeacher(String name) {
        teachers.add(name);
    }

    public void removeTeacher(String name) {
        teachers.remove(name);
    }

    public void createClass(String classname) {
        classList.add(classname);
    }

    public void displayDetails() {
        System.out.println("Students: " + students);
        System.out.println("Teachers: " + teachers);
        System.out.println("Classes: " + classList);
    }
}

class P14 {
    public static void main(String[] args) {
        School s = new School();

        s.addStudent("Suryansh");
        s.addStudent("Sneha");
        s.addTeacher("Mr.Pawan");
        s.addTeacher("Mrs. Sonia");
        s.createClass("10th A");

        s.displayDetails();

        s.removeStudent("Sneha");
        s.removeTeacher("Mr.Pawan");

        s.displayDetails();
    }
}
