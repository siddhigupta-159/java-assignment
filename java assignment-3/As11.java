import java.util.Scanner;
class As11 {                    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Enter your sex (M/F): ");
        char sex = sc.next().charAt(0);
        System.out.println("Enter your marital status (Y/N): ");
        char maritalStatus = sc.next().charAt(0);
        if (sex == 'F') {
            System.out.println("Place of service: Urban");
        } else if (sex == 'M') {
            if (age >= 20 && age <= 40) {
                System.out.println("Place of service: Anywhere");
            } else if (age > 40 && age < 60) {
                System.out.println("Place of service: Urban");
            } else {
                System.out.println("ERROR");
            }
        }
    }
}
