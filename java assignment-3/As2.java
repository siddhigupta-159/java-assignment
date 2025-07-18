import java.util.Scanner;
class As2 { 
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the quantity purchased: ");
        double quantity = sc.nextDouble();
        double unitCost = 100;
        double totalCost = quantity * unitCost;
        if (totalCost > 1000) {
         totalCost *= 0.90; // Apply 10% discount
        }
        System.out.println("Total cost for the user is: " + totalCost);
    }
}

