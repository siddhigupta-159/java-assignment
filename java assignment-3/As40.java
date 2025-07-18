import java.util.Scanner;
class As40 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost price: ");
        double costPrice = sc.nextDouble();
        System.out.println("Enter the selling price: ");
        double sellingPrice = sc.nextDouble();
        if (sellingPrice > costPrice) {
            double profit = sellingPrice - costPrice;
            System.out.println("You made a profit of: " + profit);
        } else if (sellingPrice < costPrice) {
            double loss = costPrice - sellingPrice;
            System.out.println("You incurred a loss of: " + loss);
        } else {
            System.out.println("No profit, no loss.");
        }
    }
}   
