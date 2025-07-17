import java.util.Scanner;
 class As14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length of triangle");
        int length=sc.nextInt();
        System.out.println("enter Perpendicular distance 1 of triangle ");
        int PD1=sc.nextInt();
        System.out.println("enter perpendicular distance-2 of triangle");
        int PD2=sc.nextInt();
        int AREA=(length/2)*(PD1+PD2);
        System.out.println("area of triangle:"+AREA);

    }   
}
