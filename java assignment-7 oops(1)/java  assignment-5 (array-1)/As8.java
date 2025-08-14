//  question-8 -WAP to insert a element in array at specific position.

class As8 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int element = 10;
        int position = 2; // Position to insert (0-based index)
        arr = insertElement(arr, element, position);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static int[] insertElement(int[] arr, int element, int position) {
        if (position < 0 || position > arr.length) {
            System.out.println("Invalid position.");
            return arr;
        }
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < newArr.length; i++) {
            if (i < position) {
                newArr[i] = arr[i];
            } else if (i == position) {
                newArr[i] = element;
            } else {
                newArr[i] = arr[i - 1];
            }
        }
        return newArr;
    }
}