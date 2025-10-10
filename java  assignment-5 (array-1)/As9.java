// question-9 - WAP to delete element from array at specific position.

class A9{
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int position = 2; // Position to delete (0-based index)
        arr = deleteElement(arr, position);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static int[] deleteElement(int[] arr, int position) {
        if (position < 0 || position >= arr.length) {
            System.out.println("Invalid position.");
            return arr;
        }
        int[] newArr = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != position) {
                newArr[j++] = arr[i];
            }
        }
        return newArr;
    }
}
