package StringEasy.Q01_LongestCommonPrefix;

import java.util.Arrays;

public class MySolution {
    public static void main(String[] args) {
        MySolution mySolution = new MySolution();
        String[] strs = {"flower", "flow", "flight"};
        mySolution.longestCommonPrefix(strs);
    }

    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int arrayLength = strs.length;
        StringBuilder result = new StringBuilder();
        if (arrayLength > 0) {
            int minLength = Math.min(strs[0].length(), strs[arrayLength - 1].length());
            for (int i = 0; i < minLength; i++) {
                if (strs[0].charAt(i) != strs[arrayLength - 1].charAt(i))
                    break;
                result.append(strs[0].charAt(i));
            }
        }
        return result.toString();
    }
}
