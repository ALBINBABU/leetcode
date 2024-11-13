package HashTableEasy.Q02_RomanToInteger;

public class MySolution {
    public static void main(String[] args) {
        MySolution mySolution = new MySolution();
        mySolution.romanToInt("MCMXCIV");
    }

    public int romanToInt(String s) {
        int characterArrayLength = s.length();
        int sum = 0;
        for (int i = 0; i < characterArrayLength; i++) {
            char ch = s.charAt(i);
            if (ch == 'M') {
                sum += 1000;
            } else if (ch == 'D') {
                sum += 500;
            } else if (ch == 'C') {
                if (i < characterArrayLength - 1 && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M'))
                    sum -= 100;
                else
                    sum += 100;
            } else if (ch == 'L') {
                sum += 50;
            } else if (ch == 'X') {
                if (i < characterArrayLength - 1 && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C'))
                    sum -= 10;
                else
                    sum += 10;
            } else if (ch == 'V') {
                sum += 5;
            } else if (ch == 'I') {
                if (i < characterArrayLength - 1 && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X'))
                    sum -= 1;
                else
                    sum += 1;
            }
        }
        return sum;
    }
}
