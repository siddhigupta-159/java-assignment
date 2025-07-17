import java.util.Scanner;
class As17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of board: ");
        int BL = sc.nextInt();
        System.out.println("Enter breadth of board: ");
        int Bb = sc.nextInt();
        int Barea =2*(BL+Bb);
        System.out.println("Area of board: "+Barea);
        int RL=Barea;
        System.out.println("length of ribbon:"+RL);
    }
}
