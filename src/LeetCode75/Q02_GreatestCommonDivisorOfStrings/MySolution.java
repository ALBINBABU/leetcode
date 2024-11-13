package LeetCode75.Q02_GreatestCommonDivisorOfStrings;

public class MySolution {
    public static void main(String[] args) {
        MySolution mySolution = new MySolution();
        System.out.println(mySolution.gcdOfStrings("ABABAB", "ABAB"));
    }

    public String gcdOfStrings(String str1, String str2) {
        int str1Length = str1.length();
        int str2Length = str2.length();
        int minLength = Math.min(str1Length, str2Length);
        int maxLength = Math.max(str1Length, str2Length);

        int divisor = minLength;
        int numberOfTimes;
        StringBuilder result = new StringBuilder();
        while (divisor > 0) {
            if (maxLength % divisor != 0 || minLength % divisor != 0)
                divisor--;
            else if (!str1.substring(0, minLength).equals(str2.substring(0, minLength))) {
                divisor--;
            } else {
                numberOfTimes = str1Length / divisor;
                while (numberOfTimes > 0) {
                    result.append(str1, 0, divisor);
                    numberOfTimes--;
                }
                if (!result.toString().equals(str1)) {
                    divisor--;
                } else {
                    result = new StringBuilder();
                    numberOfTimes = str2Length / divisor;
                    while (numberOfTimes > 0) {
                        result.append(str2, 0, divisor);
                        numberOfTimes--;
                    }
                    if (!result.toString().equals(str2)) {
                        divisor--;
                    } else {
                        break;
                    }
                }
            }
        }
        return str1.substring(0, divisor);
    }
}