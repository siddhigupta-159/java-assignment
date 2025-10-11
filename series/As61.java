// 61) WAP to find out all the leap years between two entered years

import java.util.Scanner;

class Testmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        System.out.println("Leap years are:");
        for (int i = start; i <= end; i++) {
            if ((i % 400 == 0) || (i % 4 == 0 && i % 100 != 0))
                System.out.println(i);
        }
    }
}
