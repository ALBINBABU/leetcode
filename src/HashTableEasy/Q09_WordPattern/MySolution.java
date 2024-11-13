package HashTableEasy.Q09_WordPattern;

import java.util.HashMap;

public class MySolution {
    public static void main(String[] args) {
        MySolution mySolution = new MySolution();
        mySolution.wordPattern("abba", "dog cat cat fish");
    }

    public boolean wordPattern(String pattern, String s) {
        int patternLength = pattern.length();
        String[] stringArray = s.split(" ");
        int stringLength = stringArray.length;
        HashMap<Character, String> characterStringHashMap = new HashMap<>();
        if (patternLength == stringLength) {
            for (int i = 0; i < patternLength; i++) {
                if (characterStringHashMap.containsKey(pattern.charAt(i))) {
                    if (!stringArray[i].equals(characterStringHashMap.get(pattern.charAt(i)))) {
                        return false;
                    }
                } else {
                    if (characterStringHashMap.containsValue(stringArray[i])) {
                        return false;
                    } else {
                        characterStringHashMap.put(pattern.charAt(i), stringArray[i]);
                    }
                }
            }
        } else {
            return false;
        }
        return true;
    }
}
