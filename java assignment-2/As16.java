import java.util.Scanner;
 class As16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of carpet: ");
        int length = sc.nextInt();
        System.out.println("Enter breadth of carpet: ");
        int breadth = sc.nextInt();
        int AREA =length*breadth;
        System.out.println("Area of carpet:"+AREA);
    }
}