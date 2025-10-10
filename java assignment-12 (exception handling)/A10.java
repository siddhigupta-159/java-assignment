// 10. Try-with-Resources
// 👉 Open a file using try-with-resources (Java 7+) and show that the file closes automatically without finally.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Testmain {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Caught IOException: " + e);
        }

        System.out.println("File closed automatically, no finally needed!");
    }
}
