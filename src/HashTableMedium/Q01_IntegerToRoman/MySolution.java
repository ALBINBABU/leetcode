package HashTableMedium.Q01_IntegerToRoman;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class MySolution {
    public static void main(String[] args) {
        MySolution mySolution = new MySolution();
        mySolution.intToRoman(1994);
    }

    public String intToRoman(int num) {
        StringBuilder result = new StringBuilder();
        HashMap<Integer, String> integerStringHashMap = new LinkedHashMap<>();
        integerStringHashMap.put(1000, "M");
        integerStringHashMap.put(900, "CM");
        integerStringHashMap.put(500, "D");
        integerStringHashMap.put(400, "CD");
        integerStringHashMap.put(100, "C");
        integerStringHashMap.put(90, "XC");
        integerStringHashMap.put(50, "L");
        integerStringHashMap.put(40, "XL");
        integerStringHashMap.put(10, "X");
        integerStringHashMap.put(9, "IX");
        integerStringHashMap.put(5, "V");
        integerStringHashMap.put(4, "IV");
        integerStringHashMap.put(1, "I");

        for (Integer key : integerStringHashMap.keySet()) {
            while (num - key >= 0) {
                result.append(integerStringHashMap.get(key));
                num = num - key;
            }
        }
        return result.toString();
    }
}
