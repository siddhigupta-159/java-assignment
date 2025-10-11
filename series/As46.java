// 46) WAP to find out the sum of first and last digit of a user entered number 

import java.util.Scanner;

class Testmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int last = num % 10;
        while (num >= 10) {
            num = num / 10;
        }
        int first = num;
        System.out.println("Sum of first and last digit: " + (first + last));
    }
}
