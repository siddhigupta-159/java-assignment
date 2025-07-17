import java.util.Scanner;
class As10{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter length of equal sides");
        double side=sc.nextDouble();
        double area=(side*side)/2;
        System.out.println("Area of isosceles right-angled triangle:"+area);
    }
}
