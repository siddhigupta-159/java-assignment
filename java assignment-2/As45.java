import java.util.Scanner;
 class As45 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first term (a):");
        int a = sc.nextInt();
        System.out.println("Enter common difference (d):");
        int d = sc.nextInt();
        System.out.println("Enter number of terms (n):");
        int n = sc.nextInt();
        int sum = n * (2 * a + (n - 1) * d) / 2;
        System.out.println("Sum of " + n + " terms of AP: " + sum);
    }
}
