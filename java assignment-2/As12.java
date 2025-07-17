import java.util.Scanner; 
 class As12 {
   public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter height of triangle (in cm):");
       double height=sc.nextDouble();
       System.out.println("Enter area of triangle (in cm:");
       double area=sc.nextDouble();
       double b=(height*height)-(area*area);
       double base=Math.sqrt(b);
       System.out.println("base of triangle:"+base);
       double length=(area/2)*base;
       System.out.println("length of triangle:"+length);
   }
}
