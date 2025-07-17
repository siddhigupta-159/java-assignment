import java.util.Scanner;
class As5{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter total cost of fence");
        int cost=sc.nextInt();
        System.out.println("Enter rate of fence");
        int rate=sc.nextInt();
        int Area=cost/rate;
        System.out.println("AREA of the park:"+Area);
        System.out.println("enter length of park");
        int length=sc.nextInt();
        int breadth=Area/length;
        System.out.println("Breadth of the park:"+breadth);
        int perimeter=2*(length+breadth);
        System.out.println("perimeter of the park:"+perimeter);
    }

}

