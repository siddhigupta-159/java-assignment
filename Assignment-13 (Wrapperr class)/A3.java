// "Hello 1 world 2 welcome 3"
//you have to add numeric value....

class Testmain {
    public static void main(String args[]) {
        String s = "Hello 1 world 2 welcome 3";
        String[] str = s.split(" ");

        int sum = 0;
        for (int i = 0; i < str.length; i++) {
            try {
                sum = sum + Integer.parseInt(str[i]);
            } catch (NumberFormatException e) {
            }
        }
        System.out.println("ADDITION OF NUMERIC VALUE : " + sum);
    }
}