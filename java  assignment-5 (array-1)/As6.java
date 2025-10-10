// question-6 - WAP to sort the array

class As6 {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 8, 1, 3 };
        // Sort the array
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    // Swap arr[i] and arr[j]
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        // Print the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}