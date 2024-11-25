package StringEasy.Q05_AddBinary;

public class MySolution {
    public static void main(String[] args) {
        MySolution mySolution = new MySolution();
        mySolution.addBinary("1010", "1");
    }

    public String addBinary(String a, String b) {
        int aLength = a.length();
        int bLength = b.length();
        StringBuilder result = new StringBuilder();
        if (aLength < bLength) {
            StringBuilder aBuilder = new StringBuilder(a);
            for (int i = 0; i < bLength - aLength; i++) {
                aBuilder.insert(0, "0");
            }
            a = aBuilder.toString();
        } else if (bLength < aLength) {
            StringBuilder bBuilder = new StringBuilder(b);
            for (int i = 0; i < aLength - bLength; i++) {
                bBuilder.insert(0, "0");
            }
            b = bBuilder.toString();
        }
        int sum = 0;
        int carry = 0;
        for (int i = a.length() - 1; i >= 0; i--) {
            sum = carry + Integer.parseInt(String.valueOf(a.charAt(i))) + Integer.parseInt(String.valueOf(b.charAt(i)));
            if (sum == 0) {
                result.insert(0, "0");
                carry = 0;
            } else if (sum == 1) {
                result.insert(0, "1");
                carry = 0;
            } else if (sum == 2) {
                result.insert(0, "0");
                carry = 1;
            } else if (sum == 3) {
                result.insert(0, "1");
                carry = 1;
            }
        }
        if (carry > 0) {
            result.insert(0, "1");
        }
        return result.toString();
    }
}
