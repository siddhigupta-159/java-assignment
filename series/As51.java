// 51) WAP to reverse all the numbers between two entered numbers

import java.util.Scanner;

class Testmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        for (int i = start; i <= end; i++) {
            int num = i, rev = 0;
            while (num > 0) {
                rev = rev * 10 + num % 10;
                num = num / 10;
            }
            System.out.println("Reverse of " + i + " is " + rev);
        }
    }
}
