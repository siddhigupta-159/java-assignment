import java.util.Scanner;
class As35{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);
        if (Character.isAlphabetic(ch)) {
            System.out.println(ch + " is an alphabetic character.");
        } else {
            System.out.println(ch + " is not an alphabetic character.");
        }
    }
}
