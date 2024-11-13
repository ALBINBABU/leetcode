package HashTableMedium.Q01_IntegerToRoman;

public class BestSolution {
    public static void main(String[] args) {
        BestSolution bestSolution = new BestSolution();
        bestSolution.solution2(58);
    }

    public String solution1(int num) {
        int[] n = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] s = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int i = 0;
        String str = new String();
        while (num > 0) {
            if (num >= n[i]) {
                str = str + s[i];
                num -= n[i];
            } else {
                i++;
            }
        }
        return str;
    }

    public String solution2(int num) {
        StringBuilder result = new StringBuilder();
        while (num >= 1000) {
            result.append("M");
            num -= 1000;
        }
        if (num >= 900) {
            result.append("CM");
            num -= 900;

        } else if (num >= 500) {
            result.append("D");
            num -= 500;
        } else if (num >= 400) {
            result.append("CD");
            num -= 400;
        }
        while (num >= 100) {
            result.append("C");
            num -= 100;
        }
        if (num >= 90) {
            result.append("XC");
            num -= 90;
        } else if (num >= 50) {
            result.append("L");
            num -= 50;
        } else if (num >= 40) {
            result.append("XL");
            num -= 40;
        }
        while (num >= 10) {
            result.append("X");
            num -= 10;
        }
        if (num == 9) {
            result.append("IX");
            num -= 9;
        } else if (num >= 5) {
            result.append("V");
            num -= 5;

        } else if (num == 4) {
            result.append("IV");
            num -= 4;
        }
        while (num > 0) {
            result.append("I");
            num -= 1;
        }
        return result.toString();
    }
}
