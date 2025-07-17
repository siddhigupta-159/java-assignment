import java.util.Scanner;
class As18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of reactangular park");
        double length = sc.nextDouble();
        System.out.println("Enter breadth of rectangular park: ");
        Double breadth = sc.nextDouble();
        double AREA =2*(length+breadth);
        double Dm=AREA*10;
        double Dkm=Dm/1000;
        System.out.println("total distance in kilometeres:"+Dkm);}
}
