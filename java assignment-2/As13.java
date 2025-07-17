import java.util.Scanner;
 class As13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter area of triangle ");
        int AREA=sc.nextInt();
        System.out.println("enter one side of triangle");
        int A=sc.nextInt();
        int B=(AREA*2)/A;
        System.out.println("length of triangle:"+B);
    }
}
