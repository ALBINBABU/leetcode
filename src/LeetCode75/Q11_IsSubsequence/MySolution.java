package LeetCode75.Q11_IsSubsequence;

public class MySolution {
    public static void main(String[] args) {
        MySolution mySolution = new MySolution();
        System.out.println(mySolution.isSubsequence("b", "abc"));
    }

    public boolean isSubsequence(String s, String t) {
        int sLength = s.length();
        int tLength = t.length();
        int currentIndex = 0;
        if (sLength > 0) {
            for (int i = 0; i < tLength; i++) {
                if (currentIndex < sLength && t.charAt(i) == s.charAt(currentIndex)) {
                    currentIndex++;
                }
            }
        }
        return currentIndex == sLength;
    }
}
