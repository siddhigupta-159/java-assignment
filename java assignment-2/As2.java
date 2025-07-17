import java.util.Scanner;
class As2{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println(" Enter area of reactangle");
        int area=sc.nextInt();
        System.out.println(" Enter breadth of reactangle");
        int breadth=sc.nextInt();
        int length=area/breadth;
        System.out.println(" length:"+length);
        int primeter=2*(length+breadth);
        System.out.println("Primeter:"+primeter);
    }
}
