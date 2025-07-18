import java.util.Scanner;
class As1{
    public static void main (String args[]){
        Scanner scn=new Scanner (System.in);
        System.out.println("Enter length of a reactangle");
        int length=scn.nextInt();
        System.out.println("Enter primeter of a reactangle");
        int primeter=scn.nextInt();
        int b=(primeter/2)-length;
        System.out.println("Breadth:"+b);
        int A=length*b;
        System.out.println("AREA:"+A);

    }
}