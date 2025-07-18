import java.util.Scanner;
class As6 {                                                                 
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        int absoluteValue = (number < 0) ? -number : number;
        System.out.println("Absolute value is: " + absoluteValue);
    }
}