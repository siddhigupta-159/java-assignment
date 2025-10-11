// 52) WAP to find out all the Armstrong numbers between two entered numbers

import java.util.Scanner;

class Testmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        for (int i = start; i <= end; i++) {
            int num = i, sum = 0, count = 0, temp = i;
            while (temp > 0) {
                count++;
                temp = temp / 10;
            }
            temp = i;
            while (temp > 0) {
                int digit = temp % 10;
                sum = sum + (int) Math.pow(digit, count);
                temp = temp / 10;
            }
            if (sum == i)
                System.out.println(i + " is an Armstrong number");
        }
    }
}
