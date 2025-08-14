// question-10 - WAP to to count the occurance of all element in array

class A10{
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 3, 3, 4, 4, 4, 4 };
        countOccurrences(arr);
    }

    public static void countOccurrences(int[] arr) {
        int[] count = new int[100]; // Assuming elements are in range 0-99
        for (int num : arr) {
            count[num]++;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.println("Element " + i + " occurs " + count[i] + " times.");
            }
        }
    }
}
