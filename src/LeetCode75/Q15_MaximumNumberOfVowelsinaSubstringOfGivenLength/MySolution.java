package LeetCode75.Q15_MaximumNumberOfVowelsinaSubstringOfGivenLength;

import java.util.Arrays;
import java.util.List;

public class MySolution {
    public static void main(String[] args) {
        MySolution mySolution = new MySolution();
        mySolution.maxVowels("weallloveyou", 7);
    }

    public int maxVowels(String s, int k) {
        int stringLength = s.length();
        List<Character> characterList = Arrays.asList('a', 'e', 'i', 'o', 'u');
        int numberOfOperation = 0;
        int maxNumberOfOperation = 0;
        for (int i = 0; i < k; i++) {
            if (characterList.contains(s.charAt(i))) {
                numberOfOperation++;
            }
        }
        maxNumberOfOperation = Math.max(numberOfOperation, maxNumberOfOperation);
        for (int i = k; i < stringLength; i++) {
            if (characterList.contains(s.charAt(i))) {
                numberOfOperation++;
            }
            if (characterList.contains(s.charAt(i - k))) {
                numberOfOperation--;
            }
            maxNumberOfOperation = Math.max(numberOfOperation, maxNumberOfOperation);
        }
        return maxNumberOfOperation;
    }
}
