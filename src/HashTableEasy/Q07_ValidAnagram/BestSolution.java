package HashTableEasy.Q07_ValidAnagram;

import java.util.Arrays;

public class BestSolution {
    public static void main(String[] args) {
        BestSolution bestSolution = new BestSolution();
        bestSolution.isAnagram("anagram", "nagaram");
    }

    public boolean isAnagram(String s, String t) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        String sString = new String(sArray);
        String tString = new String(tArray);
        return sString.equals(tString);
    }
}
