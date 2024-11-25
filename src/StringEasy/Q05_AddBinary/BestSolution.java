package StringEasy.Q05_AddBinary;

public class BestSolution {
    public static void main(String[] args) {
        BestSolution bestSolution = new BestSolution();
        bestSolution.addBinary("1010", "1011");
    }

    public String addBinary(String a, String b) {
        int aLength = a.length() - 1;
        int bLength = b.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();
        while (aLength >= 0 || bLength >= 0 || carry > 0) {
            if (aLength >= 0) {
                carry += Integer.parseInt(String.valueOf(a.charAt(aLength--)));
            }
            if (bLength >= 0) {
                carry += Integer.parseInt(String.valueOf(b.charAt(bLength--)));
            }
            result.insert(0, carry % 2);
            carry = carry / 2;
        }
        return result.toString();
    }
}
