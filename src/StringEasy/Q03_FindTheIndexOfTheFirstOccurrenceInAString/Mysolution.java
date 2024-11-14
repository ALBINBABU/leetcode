package StringEasy.Q03_FindTheIndexOfTheFirstOccurrenceInAString;

public class Mysolution {
    public static void main(String[] args) {
        Mysolution mysolution = new Mysolution();
        mysolution.strStr("sadbutsad", "sad");
    }

    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
