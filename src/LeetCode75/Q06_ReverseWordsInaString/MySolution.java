package LeetCode75.Q06_ReverseWordsInaString;

public class MySolution {
    public static void main(String[] args) {
        String str = " albin  robin mabin  magy babu ";
        System.out.println(reverseWords(str));
    }

    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                if (result.length() == 0) {
                    result.append(word);
                } else {
                    result.insert(0, word + " ");
                }
            }
        }
        return result.toString();
    }
}
