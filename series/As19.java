//question- 19)    1	+	1/2	+	1/3	+	1/4	+	1/5	….. n terms(find out sum)

import java.util.Scanner;

class Testmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int i = 1;
        double sum = 0;
        while (i <= n) {
            sum += 1.0 / i;
            i++;
        }
        System.out.print(" Sum" + sum);
    }
}
