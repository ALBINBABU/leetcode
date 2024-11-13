package HashTableEasy.Q07_ValidAnagram;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MySolution {
    public static void main(String[] args) {
        MySolution mySolution = new MySolution();
        mySolution.isAnagram("anagram", "nagaram");
    }

    public boolean isAnagram(String s, String t) {
        int stringLength = s.length();
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();
        char sCh, tCh;
        if (stringLength == t.length()) {
            for (int i = 0; i < stringLength; i++) {
                sCh = s.charAt(i);
                tCh = t.charAt(i);
                if (sMap.containsKey(sCh)) {
                    sMap.put(sCh, sMap.get(sCh) + 1);
                } else {
                    sMap.put(sCh, 1);
                }
                if (tMap.containsKey(tCh)) {
                    tMap.put(tCh, tMap.get(tCh) + 1);
                } else {
                    tMap.put(tCh, 1);
                }
            }
            for (Map.Entry<Character, Integer> value : sMap.entrySet()) {
                if (!(tMap.containsKey(value.getKey()) && Objects.equals(value.getValue(), tMap.get(value.getKey())))) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
