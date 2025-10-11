//question-11)WAP to print N odd numbers. 

import java.util.Scanner;

class Testmain {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit : ");
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            System.out.println("Odd number is : " + i);
            i += 2;
        }
    }
}