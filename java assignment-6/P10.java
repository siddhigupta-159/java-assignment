//  Write a program to cyclically rotate array by one.

class Testmain {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[arr.length - 1];
            arr[arr.length - 1] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
    }
}
