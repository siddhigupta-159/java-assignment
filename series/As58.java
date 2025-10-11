// 58) WAP to convert decimal number into binary number without using array

import java.util.Scanner;

class Testmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int binary = 0, base = 1;
        while (num > 0) {
            int rem = num % 2;
            binary = binary + rem * base;
            base = base * 10;
            num = num / 2;
        }
        System.out.println("Binary number is: " + binary);
    }
}
