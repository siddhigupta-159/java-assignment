// question-18) 1 2 2 4 8 32 ...... n terms

import java.util.Scanner;

class Testmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i = 1, term = 1;
        System.out.print("Enter number of terms: ");
        n = sc.nextInt();
        while (i <= n) {
            System.out.print(term + " ");
            if (i == 1) {
                term = 2;
                System.out.print(term);
            } else
                term = term * term;
            i++;
        }
        System.out.println();
    }
}