// question-42)  WAP to find out HCF of a number

import java.util.Scanner;

class Testmain {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int min = 0;
        int hcf = 0;
        if (x > y) {
            min = x;
        } else {
            min = y;
        }
        while (true) {
            if (min % x == 0 && min % y == 0) {
                hcf = min;
                break;
            }
            min++;

        }
        System.out.println("HCF is: " + hcf);

    }
}