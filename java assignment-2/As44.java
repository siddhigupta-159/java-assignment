import java.util.Scanner;
class As44 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first term (a):");
        int a = sc.nextInt();
        System.out.println("Enter common difference (d):");
        int d = sc.nextInt();
        System.out.println("Enter term number (n):");
        int n = sc.nextInt();
        int nthTerm = a + (n - 1) * d;
        System.out.println(n + "th term of AP: " + nthTerm);
    }
}
