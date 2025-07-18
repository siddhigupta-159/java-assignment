import java.util.Scanner;
class As1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of length");
        int length=sc.nextInt();
        System.out.println("enter the value of breadth");
        int breadth=sc.nextInt();
        if(length==breadth)
        System.out.println("it is a square");
        else
        System.out.println("it is not a square");
    }
}