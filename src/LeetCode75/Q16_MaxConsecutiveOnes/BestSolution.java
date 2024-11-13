package LeetCode75.Q16_MaxConsecutiveOnes;

public class BestSolution {
    public static void main(String[] args) {
        BestSolution bestSolution = new BestSolution();
        bestSolution.longestOnes(new int[]{0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1}, 3);
    }

    public int longestOnes(int[] nums, int k) {
        int start = 0;
        int end = 0;
        int numberOfZeros = 0;
        int maxLength = 0;
        int arrayLength = nums.length;
        while (end < arrayLength) {
            if (nums[end] == 0) {
                numberOfZeros++;
            }
            if (numberOfZeros > k) {
                while (nums[start++] != 0) {
                }
                numberOfZeros--;
            }
            maxLength = Math.max(maxLength, end - start + 1);
            end++;
        }
        return maxLength;
    }
}
