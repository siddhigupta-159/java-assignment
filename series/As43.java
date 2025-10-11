// 43) WAP to convert binary number into decimal number

import java.util.Scanner;

class Testmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int binary = sc.nextInt();
        int decimal = 0, base = 1, rem;
        while (binary > 0) {
            rem = binary % 10;
            decimal = decimal + rem * base;
            binary = binary / 10;
            base = base * 2;
        }
        System.out.println("Decimal number is: " + decimal);
    }
}
