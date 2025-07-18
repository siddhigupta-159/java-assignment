import java.util.Scanner;
class As3 { 
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        double salary = sc.nextDouble();
        System.out.println("Enter your years of service: ");
        double yearsOfService = sc.nextDouble();
        double bonus = 0;
        if (yearsOfService > 5) {
            bonus = salary * 0.05;
        }
         System.out.println("Your net bonus amount is: " + bonus);
    }
}   
