// 27 Find occurance of an integer number in array.
import java.util.*;

class Testmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.print("Enter number to count: ");
        int num = sc.nextInt();

        int count = 0;
        for (int i = 0; i < n; i++)
            if (arr[i] == num)
                count++;

        System.out.println("Occurrence of " + num + " = " + count);
    }
}
