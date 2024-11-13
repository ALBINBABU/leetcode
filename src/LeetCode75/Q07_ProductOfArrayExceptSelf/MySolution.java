package LeetCode75.Q07_ProductOfArrayExceptSelf;

import java.util.Arrays;

public class MySolution {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4};
        productExceptSelf(nums);
    }

    public static int[] productExceptSelf(int[] nums) {
        int numsLength = nums.length;
        int[] result = new int[numsLength];
        Arrays.fill(result, 1);
        for (int i = 0; i < numsLength; i++) {
            for (int j = 0; j < numsLength; j++) {
                if (i != j)
                    result[i] = result[i] * nums[j];
            }
        }
        return result;
    }
}