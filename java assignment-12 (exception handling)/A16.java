// 6. Student Management System
// You are fetching student data from a database. If the record is not found:
// Will you return null or throw a RecordNotFoundException?
// Which approach is better and why?


import java.util.Scanner;

class RecordNotFoundException extends Exception {
    RecordNotFoundException(String message) {
        super(message);
    }
}

class Testmain {
    static int[] studentIds = { 101, 102, 103 };
    static String[] studentNames = { "Alice", "Bob", "Charlie" };

    static String getStudent(int id) throws RecordNotFoundException {
        for (int i = 0; i < studentIds.length; i++) {
            if (studentIds[i] == id) {
                return studentNames[i];
            }
        }

        throw new RecordNotFoundException("Student record not found for ID: " + id);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student ID to search: ");
        int searchId = sc.nextInt();

        try {
            String student = getStudent(searchId);
            System.out.println("Student Name: " + student);
        } catch (RecordNotFoundException e) {
            e.printStackTrace();
            System.out.println("Friendly message: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}
