import java.util.Scanner;
class As3{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter length of tile");
        int length=sc.nextInt();
        System.out.println("Enter breadth of tile");
        int breadth=sc.nextInt();
        int area=length*breadth;
        System.out.println("area of Tiles:"+area);
        System.out.println("Enter LENGTH of region:");
        int LENGTH=sc.nextInt();
        System.out.println("Enter BREADTH of region");
        int BREADTH=sc.nextInt();
        int AREA=LENGTH*BREADTH;
        System.out.println("area of region:"+AREA);
        int notiles=AREA/area;
        System.out.println("no. of tiles:"+notiles);


    }
}