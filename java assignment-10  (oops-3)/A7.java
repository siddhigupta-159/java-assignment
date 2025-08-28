// question-19 = Make list of Students having name, roll no., age, score. Write a program to
//   accept 10 students record and arrange the Students based on the score group
//   [0-50], [50-65],[65-80],[80-100]
 
import java.util.ArrayList;
import java.util.Scanner;

class Students {
    String name;
    int rollNo;
    int age;
    int score;

    public Students(String name, int rollNo, int age, int score) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Roll No: " + rollNo + ", Age: " + age + ", Score: " + score;
    }
}

class TestMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Students> studentsList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            String name = sc.nextLine();
            System.out.print("Enter roll no of student " + (i + 1) + ": ");
            int rollNo = sc.nextInt();
            System.out.print("Enter age of student " + (i + 1) + ": ");
            int age = sc.nextInt();
            System.out.print("Enter score of student " + (i + 1) + ": ");
            int score = sc.nextInt();
            sc.nextLine(); // Consume newline

            studentsList.add(new Students(name, rollNo, age, score));
        }

        ArrayList<Students> group1 = new ArrayList<>();
        ArrayList<Students> group2 = new ArrayList<>();
        ArrayList<Students> group3 = new ArrayList<>();
        ArrayList<Students> group4 = new ArrayList<>();

        for (Students student : studentsList) {
            if (student.score >= 0 && student.score < 50) {
                group1.add(student);
            } else if (student.score >= 50 && student.score < 65) {
                group2.add(student);
            } else if (student.score >= 65 && student.score < 80) {
                group3.add(student);
            } else if (student.score >= 80 && student.score <= 100) {
                group4.add(student);
            }
        }

        System.out.println("\nStudents with score [0-50]:");
        for (Students s : group1) {
            System.out.println(s);
        }

        System.out.println("\nStudents with score [50-65]:");
        for (Students s : group2) {
            System.out.println(s);
        }

        System.out.println("\nStudents with score [65-80]:");
        for (Students s : group3) {
            System.out.println(s);
        }

        System.out.println("\nStudents with score [80-100]:");
        for (Students s : group4) {
            System.out.println(s);
        }
    }
}
