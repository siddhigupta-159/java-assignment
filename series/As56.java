// 56) WAP to print factorial of all the numbers between two entered numbers

import java.util.Scanner;

class Testmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        for (int i = start; i <= end; i++) {
            int fact = 1;
            for (int j = 1; j <= i; j++) {
                fact = fact * j;
            }
            System.out.println("Factorial of " + i + " is: " + fact);
        }
    }
}
