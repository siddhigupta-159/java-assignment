import java.util.Scanner;
class As6{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter side A of triangle");
        double A=sc.nextDouble();
        System.out.println("Enter side B of triangle");
        double B=sc.nextDouble();
        System.out.println("Enter Primeter of triangle");
        double P=sc.nextDouble();
        double C=P-(A+B);
        System.out.println("side c of triangle:"+C);
        double S=(A+B+C)/2;       //S=semi primeter
        System.out.println("Semi primeter of triangle:"+S);
        double area= S*(S-A)*(S-B)*(S-C);
        double AREA=Math.sqrt(area);
        System.out.println("Final area of triangle:"+AREA);
    }
}