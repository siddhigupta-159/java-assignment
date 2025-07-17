import java.util.Scanner;
class As8{
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter altitude of triangle");
        double  A=sc.nextDouble();
        System.out.println("Enter Area of triangle");
        double Area=sc.nextDouble();
        double base=2*(Area/A);
        System.out.println("base of triangle:"+base);
    }
}   