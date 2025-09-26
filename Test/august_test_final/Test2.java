// Write a Java program to reverse each word in a string while keeping the word order same.
// Example:
// Input: Java is very simple.
// Output: avaJ si yrev elpmis.

class Test2{
    public static void main(String args[]) {
        String str = "Java is very simple ";
        char s[] = str.toCharArray();
        int start = 0, end = s.length - 1;
        
        while (start <= end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;

        }


        for (char element : s) {
            System.out.print(element);
        }
    }
}
    

