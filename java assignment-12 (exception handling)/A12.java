// 2. File Upload System
// A web app allows file upload. But the file path provided by the user does not exist.
// Which Java exception will occur?
// How would you handle it so the program doesn’t crash?
// Should you retry or show a friendly message to the user?

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Testmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file path to upload: ");
        String path = sc.nextLine();

        File file = new File(path);

        try {
            Scanner fileReader = new Scanner(file); // This will throw exception if file not found
            System.out.println("File content:");
            while (fileReader.hasNextLine()) {
                System.out.println(fileReader.nextLine());
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Oops! File not found. Please check the path and try again.");
        }

        System.out.println("Program continues without crashing...");
    }
}
