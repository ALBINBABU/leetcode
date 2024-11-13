package LeetCode75.Q05_ReverseVowelsOfaString;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class MySolution {
    public static void main(String[] args) {
        String str = "albinbabu";
        reverseVowels(str);
    }

    public static String reverseVowels(String str) {
        List<Character> characterList = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        int strLength = str.length();
        Deque<Character> vowels = new LinkedList<>();

        StringBuilder reverseStr = new StringBuilder();
        for (int i = 0; i < strLength; i++) {
            if (characterList.contains(str.charAt(i))) {
                vowels.push(str.charAt(i));
            }
        }
        for (int i = 0; i < strLength; i++) {
            if (characterList.contains(str.charAt(i))) {
                reverseStr.append(vowels.pop());
            } else {
                reverseStr.append(str.charAt(i));
            }
        }
        return reverseStr.toString();
    }
}
