
// WAP to enter mobile of user and check whther it is valid name or invalid .
//[length must be 10, all letter must be digit......]
import java.util.Scanner;

class Testmain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Mobile NUmber......");
        String str = sc.nextLine();

        Boolean isvalid = false;
        char[] num = str.toCharArray();
        if (num.length == 10) {
            for (char n : num) {
                Character cobj = n;
                if (Character.isDigit(cobj)) {
                    isvalid = true;
                } else {
                    isvalid = false;
                    break;
                }

            }
        } else {
            System.out.println("Number is not valid...");
        }
        if (isvalid == true) {
            System.out.println("Number is valid.....");
        }
    }
}