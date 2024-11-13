package LeetCode75.Q09_StringCompression;

public class MySolution {
    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        MySolution mySolution = new MySolution();
        mySolution.compress(chars);
    }

    public int compress(char[] chars) {
        StringBuilder result = new StringBuilder();
        char currentValue = chars[0];
        int charsLength = chars.length;
        int numberOfOperation = 1;
        for (int i = 1; i < charsLength; i++) {
            if (currentValue == chars[i]) {
                numberOfOperation++;
            } else {
                appendOperation(result, currentValue, numberOfOperation);
                numberOfOperation = 1;
                currentValue = chars[i];
            }
        }
        appendOperation(result, currentValue, numberOfOperation);
        char[] resultArray = result.toString().toCharArray();
        charsLength = resultArray.length;
        System.arraycopy(resultArray, 0, chars, 0, charsLength);
        return charsLength;
    }

    private void appendOperation(StringBuilder result, char currentValue, int numberOfOperation) {
        if (numberOfOperation > 1)
            result.append(currentValue).append(numberOfOperation);
        else
            result.append(currentValue);
    }
}
