// 60) WAP to print Square,Cube and Square Root of all numbers from 1 to N

import java.util.Scanner;

class Testmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            double sq = Math.pow(i, 2);
            double cube = Math.pow(i, 3);
            double sqrt = Math.sqrt(i);
            System.out.println("Number: " + i);
            System.out.println("Square: " + sq);
            System.out.println("Cube: " + cube);
            System.out.println("Square Root: " + sqrt);
            System.out.println();
        }
    }
}
