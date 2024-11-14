package StringEasy.Q04_LengthOfLastWord;

public class MySolution {
    public static void main(String[] args) {
        MySolution mySolution = new MySolution();
        mySolution.lengthOfLastWord("   fly me   to   the moon  ");
        mySolution.lengthOfLastWordBest("   fly me   to   the moon  ");
    }

    public int lengthOfLastWord(String s) {
        String[] stringArray = s.strip().split(" ");
        return stringArray[stringArray.length - 1].length();
    }

    public int lengthOfLastWordBest(String s) {
        s = s.trim();
        int lastSpaceIndex = s.lastIndexOf(' ');
        if (lastSpaceIndex == -1) {
            return s.length();
        } else {
            return s.length() - lastSpaceIndex - 1;
        }
    }
}
