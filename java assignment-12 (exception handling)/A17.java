// 7. Network Connection
// Suppose you are connecting to a server. The connection might fail due to network issues.
// Which exception will be thrown?
// Should you handle it with try-catch or let it propagate using throws? Why?

import java.io.IOException;
import java.util.Scanner;

class Testmain {
    static void connectToServer(boolean networkAvailable) throws IOException {
        if (networkAvailable) {
            System.out.println("Connected to server successfully!");
        } else {
            throw new IOException("Network error: Unable to connect to server");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Is network available? (true/false): ");
        boolean networkAvailable = sc.nextBoolean();

        try {
            connectToServer(networkAvailable);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Failed to connect. Please check your network or try later.");
        }

        System.out.println("Program continues...");
    }
}
