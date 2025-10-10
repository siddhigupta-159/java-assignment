// question-5 - WAP to replace all element with 0 which is multiple of 5

class As5 {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 5 == 0) {
                arr[i] = 0;
            }
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
