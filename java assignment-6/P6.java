// Q.6 Sort the array of 0s , 1s and 2s.

import java.util.*;

class Testmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements (0,1,2):");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int c0 = 0, c1 = 0, c2 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                c0++;
            else if (arr[i] == 1)
                c1++;
            else
                c2++;
        }

        int k = 0;
        while (c0-- > 0)
            arr[k++] = 0;
        while (c1-- > 0)
            arr[k++] = 1;
        while (c2-- > 0)
            arr[k++] = 2;

        System.out.println("Sorted Array:");
        for (int x : arr)
            System.out.print(x + " ");
    }
}
