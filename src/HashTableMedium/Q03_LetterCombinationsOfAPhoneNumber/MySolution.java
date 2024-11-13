package HashTableMedium.Q03_LetterCombinationsOfAPhoneNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MySolution {
    public static void main(String[] args) {
        MySolution mySolution = new MySolution();
        mySolution.letterCombinations("23");
    }

    public List<String> letterCombinations(String digits) {
        Map<Integer, List<String>> letterCombinations = new HashMap<>();
        letterCombinations.put(2, Arrays.asList("a", "b", "c"));
        letterCombinations.put(3, Arrays.asList("d", "e", "f"));
        letterCombinations.put(4, Arrays.asList("g", "h", "i"));
        letterCombinations.put(5, Arrays.asList("j", "k", "l"));
        letterCombinations.put(6, Arrays.asList("m", "n", "o"));
        letterCombinations.put(7, Arrays.asList("p", "q", "r", "s"));
        letterCombinations.put(8, Arrays.asList("t", "u", "v"));
        letterCombinations.put(9, Arrays.asList("w", "x", "y", "z"));
        List<String> result = new ArrayList<>();

        int digitsLength = digits.length();
        if (digitsLength > 0) {
            result = letterCombinations.get(Character.getNumericValue(digits.charAt(0)));
            int i = 1;
            while (i < digitsLength) {
                List<String> cacheResult = new ArrayList<>();
                for (String outer : result) {
                    for (String inner : letterCombinations.get(Character.getNumericValue(digits.charAt(i)))) {
                        cacheResult.add(outer + inner);
                    }
                }
                result = cacheResult;
                i++;
            }
        }
        return result;
    }
}
