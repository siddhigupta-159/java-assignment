import java.util.Scanner;
class As15 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length of Shelly'sgarden ");
        int SL=sc.nextInt();
        System.out.println("enter breadth of Shelly'sgarden ");
        int SB=sc.nextInt();
        int Sarea=SL*SB;
        System.out.println("area of Shelly'sgarden:"+Sarea);
        System.out.println("enter length of Rachel'sgarden ");
        int RL=sc.nextInt();
        int Rarea=RL*RL;
        System.out.println("area of Rachel'sgarden:"+Rarea);
        int BiggerArea=Rarea-Sarea;
        System.out.println("Bigger area is:"+BiggerArea);
    }
}
