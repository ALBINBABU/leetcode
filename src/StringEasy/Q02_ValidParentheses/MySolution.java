package StringEasy.Q02_ValidParentheses;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class MySolution {
    public static void main(String[] args) {
        MySolution mySolution = new MySolution();
        mySolution.isValid("]");
    }

    public boolean isValid(String s) {
        Map<Character, Character> characterMap = new HashMap<>();
        characterMap.put('(', ')');
        characterMap.put('{', '}');
        characterMap.put('[', ']');
        int stringLength = s.length();
        Deque<Character> characterStack = new LinkedList<>();
        for (int i = 0; i < stringLength; i++) {
            if (characterMap.containsKey(s.charAt(i))) {
                characterStack.push(s.charAt(i));
            } else if (characterStack.isEmpty())
                return false;
            else if (!characterMap.get(characterStack.pop()).equals(s.charAt(i)))
                return false;
        }
        return characterStack.isEmpty();
    }
}
