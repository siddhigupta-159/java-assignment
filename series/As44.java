// 44) WAP to interchange first and last digit of a number

import java.util.Scanner;

class Testmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int last = num % 10;
        int count = 0;
        while (temp >= 10) {
            temp = temp / 10;
            count++;
        }
        int first = temp;
        int power = (int) Math.pow(10, count);
        int middle = num % power;
        middle = middle / 10;
        int newNum = last * power + middle * 10 + first;
        System.out.println("After interchanging first and last digit: " + newNum);
    }
}
