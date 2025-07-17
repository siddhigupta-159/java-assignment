import java.util.Scanner;
 class As23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of carton: ");
        int length = scanner.nextInt();
        System.out.print("Enter breadth of carton: ");
        int breadth = scanner.nextInt();
        System.out.print("Enter height of carton: ");
        int height = scanner.nextInt();
        int volume = length * breadth * height;
        System.out.println("Volume of carton: " + volume);
        System.out.print("Enter length of cube box: ");
        int cubeLength = scanner.nextInt();
        int cubeside1=length/cubeLength;
        int cubeside2=breadth/cubeLength;
        int cubeside3=height/cubeLength;
        int totalCubes = cubeside1 * cubeside2 * cubeside3;
        System.out.println("Total number of cube boxes that can fit: " + totalCubes);
    }
}

