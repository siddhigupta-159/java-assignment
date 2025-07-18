import java.util.Scanner;
class As15 {            
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost price of the bike: ");
        double costPrice = sc.nextDouble();
        double tax = 0;
         if (costPrice > 100000) {
            tax = costPrice * 0.15; // 15% tax
        } else if (costPrice > 50000 && costPrice <= 100000) {
            tax = costPrice * 0.10; // 10% tax
        } else if (costPrice <= 50000) {
            tax = costPrice * 0.05; // 5% tax
        }
        System.out.println("The road tax to be paid is: " + tax);
    }
}                
