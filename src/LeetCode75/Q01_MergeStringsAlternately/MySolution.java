package LeetCode75.Q01_MergeStringsAlternately;

public class MySolution {
    public static void main(String[] args) {
        MySolution mySolution = new MySolution();
        System.out.println(mySolution.mergeAlternately("abc", "pqr"));
    }

    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int word1Length = word1.length();
        int word2Length = word2.length();
        int minLength = Math.min(word1Length, word2Length);
        for (int i = 0; i < minLength; i++) {
            result.append(word1.charAt(i)).append(word2.charAt(i));
        }
        if (word1Length < word2Length) {
            result.append(word2.substring(minLength));
        } else {
            result.append(word1.substring(minLength));
        }
        return result.toString();
    }
}
