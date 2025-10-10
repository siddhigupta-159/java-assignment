// 9. Throws Keyword
// 👉 Write a method readFile(String fileName) that uses FileReader. Declare it with throws IOException and handle it in main().

import java.io.IOException;

class readFile {
    public void divide(int a, int b) throws IOException {
        if (b == 0) {
            throw new IOException("Divide by zero not allowed (checked)");
        }
        System.out.println("Result: " + (a / b));
    }
}

class Testmain {
    public static void main(String[] args) {
        readFile r = new readFile();
        try {
            r.divide(10, 0);
        } catch (IOException e) {
            System.out.println("Caught: " + e);
        }
    }
}