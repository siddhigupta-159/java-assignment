import java.util.Scanner;
class As9 {
     public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a lowercase letter.");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is an uppercase letter.");
        } else {
            System.out.println(ch + " is not an alphabetic character.");
        }
    }
}