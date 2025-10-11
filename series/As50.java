// 50) WAP to find out all the palindrome numbers between two entered numbers

import java.util.Scanner;

class Testmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        for (int i = start; i <= end; i++) {
            int num = i, rev = 0, rem;
            while (num > 0) {
                rem = num % 10;
                rev = rev * 10 + rem;
                num = num / 10;
            }
            if (rev == i)
                System.out.println(i + " is a palindrome number");
        }
    }
}
