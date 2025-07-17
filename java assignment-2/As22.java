import java.util.Scanner;
 class As22 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of pond: ");
        int length = scanner.nextInt();
        System.out.println("Enter width of pond: ");
        int width = scanner.nextInt();
        System.out.println("enter depth of pond: ");
        int depth = scanner.nextInt();
        int volume = length * width * depth;
        System.out.println("Volume of pond: " + volume);
    }
}
