package HashTableMedium.Q02_LongestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;

public class MySolution {
    public static void main(String[] args) {
        MySolution mySolution = new MySolution();
        mySolution.lengthOfLongestSubstring("pwwkew");
    }

    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> characterList = new HashSet<>();
        int stringLength = s.length();
        int max = 0;
        int i = 0;
        int j = 0;
        while (j < stringLength) {
            if (characterList.contains(s.charAt(j))) {
                while (i <= j) {
                    if (s.charAt(i) == s.charAt(j)) {
                        i++;
                        j++;
                        break;
                    }
                    characterList.remove(s.charAt(i));
                    i++;
                }
            } else {
                characterList.add(s.charAt(j));
                max = Math.max(max, j - i + 1);
                j++;
            }
        }
        return max;
    }
}
