
// WAP to enter name of user and check whether it valid name or not.....
import java.util.Scanner;

class Testmain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name ...");
        String name = sc.nextLine();

        Boolean isvalid = false;
        char[] str = name.toCharArray();
        for (char s : str) {
            if (s >= 'A' && s <= 'z') {
                isvalid = true;
            } else {
                isvalid = false;
                break;
            }
        }
        if (isvalid == true) {
            System.out.println("its a valid name..");
        } else {
            System.out.println("its not a valid name..");
        }
    }
}