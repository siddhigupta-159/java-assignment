// Write a Java program to create a class called "Student" with a name, grade,
// and courses attributes, and methods to add and remove courses.

import java.util.ArrayList;

class Student {
    ArrayList<Course> clist = new ArrayList<Course>();

    public void addCourse(Course c) {
        clist.add(c);
    }

    public void removeCourse(Course c) {
        clist.remove(c);
    }

    public void displayCourses() {
        for (Course course : clist) {
            System.out.println(course.display());
        }
    }
}

class Course {
    private String name;
    private String grades;
    private String course;

    public Course(String name, String grades, String course) {
        this.name = name;
        this.grades = grades;
        this.course = course;
    }

    public void course() {

    }

    public String display() {
        return this.name + " " + this.grades + " " + this.course;
    }
}

class P10 {
    public static void main(String[] args) {
        Course course1 = new Course("Siddhi", "A", "B.A.");
        Course course2 = new Course("Suryansh", "A", "B.com");
        Student course = new Student();
        course.addCourse(course1);
        course.addCourse(course2);
        course.displayCourses();
        course.removeCourse(course2);
        course.displayCourses();
    }
}