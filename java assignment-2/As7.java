import java.util.Scanner;
class As7{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base of triangle");
        int base=sc.nextInt();
        System.out.println("Enter Area of triangle");
        int Area=sc.nextInt();
        int height=(2*Area)/base;
        System.out.println("Height of triangle:"+height);

    }
}
    