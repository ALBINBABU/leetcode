package HashTableMedium.Q05_GroupAnagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MySolution {
    public static void main(String[] args) {
        MySolution mySolution = new MySolution();
        mySolution.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> stringmap = new HashMap<>();
        List<String> innerList;
        char[] charArray;
        String value;
        for (String str : strs) {
            charArray = str.toCharArray();
            Arrays.sort(charArray);
            value = new String(charArray);
            innerList = stringmap.getOrDefault(value, new ArrayList<>());
            innerList.add(str);
            stringmap.put(value, innerList);
        }
        return new ArrayList<>(stringmap.values());
    }
}
