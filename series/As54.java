// 54) WAP to print all the even numbers between two entered numbers

import java.util.Scanner;

class Testmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        System.out.println("Even numbers are:");
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }
    }
}
