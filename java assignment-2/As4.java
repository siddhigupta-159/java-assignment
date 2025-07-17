import java.util.Scanner;
class As4{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of land");
        int length=sc.nextInt();
        System.out.println("Enter wide of land");
        int wide=sc.nextInt();
        System.out.println("Enter rate of tiles");
        int rate=sc.nextInt();
        int A=length*wide;
        System.out.println("area of land:"+A);
        int unit=A/100;
        System.out.println("total cost:"+unit);
    }
}