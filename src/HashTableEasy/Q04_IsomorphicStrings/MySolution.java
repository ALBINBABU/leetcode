package HashTableEasy.Q04_IsomorphicStrings;

import java.util.HashMap;

public class MySolution {
    public static void main(String[] args) {
        MySolution mySolution = new MySolution();
        mySolution.isIsomorphic("paper", "title");
    }

    public boolean isIsomorphic(String s, String t) {
        int stringLength = s.length();
        HashMap<Character, Character> characterHashMap = new HashMap<>();
        for (int i = 0; i < stringLength; i++) {
            if (characterHashMap.containsKey(s.charAt(i))) {
                if (t.charAt(i) != characterHashMap.get(s.charAt(i))) {
                    return false;
                }
            } else {
                if (characterHashMap.containsValue(t.charAt(i)))
                    return false;
                characterHashMap.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }
}
