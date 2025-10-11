//questio-20)  0	7	14	21	28	35	…..

import java.util.Scanner;

class Testmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {

            System.out.print(i * 7+ " ");
        }
    }
}
