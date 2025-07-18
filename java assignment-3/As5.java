import java.util.Scanner;
class As5 { 
      public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of person 1: ");
        int age1 = sc.nextInt();
        System.out.println("Enter the age of person 2: ");
        int age2 = sc.nextInt();
        System.out.println("Enter the age of person 3: ");
        int age3 = sc.nextInt();
        int oldest, youngest;
 // Determine oldest
        if (age1 >= age2 && age1 >= age3) {
            oldest = age1;
        } else if (age2 >= age1 && age2 >= age3) {
            oldest = age2;
        } else {
            oldest = age3;
        }
 // Determine youngest
        if (age1 <= age2 && age1 <= age3) {
            youngest = age1;
        } else if (age2 <= age1 && age2 <= age3) {
            youngest = age2;
        } else {
            youngest = age3;
        }
        System.out.println("Oldest person is: " + oldest + " years old");
        System.out.println("Youngest person is: " + youngest + " years old");
    }
}