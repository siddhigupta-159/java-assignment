// 57) WAP to print all the prime numbers between two entered numbers

import java.util.Scanner;

class Testmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        System.out.println("Prime numbers are:");
        for (int i = start; i <= end; i++) {
            if (i < 2)
                continue;
            boolean prime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime)
                System.out.println(i);
        }
    }
}
