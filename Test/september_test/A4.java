// 🧵 4. String Problem #2

// Reverse Each Word in a Sentence

// Input: "Java makes coding fun"

// Output: "avaJ sekam gnidoc nuf"

// Keep the word order intact but reverse the characters of each word.

class A4 {
    public static void main(String[] args) {
        String input = "Java makes coding fun";
        String[] words = input.split(" ");
        String result = "";

        for (String word : words) {
            String reversed = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reversed = reversed + word.charAt(i);
            }
            result += reversed + " ";
        }

        System.out.println(result.trim());
    }
}
