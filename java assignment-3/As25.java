import java.util.Scanner;
class As25 {public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 5: ");
        int number = sc.nextInt();
        String numberInWords;
        switch (number) {
            case 1:
                numberInWords = "One";
                break;
            case 2:
                numberInWords = "Two";
                break;
            case 3:
                numberInWords = "Three";
                break;
            case 4:
                numberInWords = "Four";
                break;
            case 5:
                numberInWords = "Five";
                break;
            default:
                numberInWords = "Invalid input! Please enter a number between 1 and 5.";
        }
        System.out.println("The number in words is: " + numberInWords);
    }
}