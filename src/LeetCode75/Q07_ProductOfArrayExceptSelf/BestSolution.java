package LeetCode75.Q07_ProductOfArrayExceptSelf;

import java.util.Arrays;

public class BestSolution {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5};
        productExceptSelf(nums);
    }

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        Arrays.fill(ans, 1);
        int curr = 1;
        for (int i = 0; i < n; i++) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        curr = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        return ans;
    }
}
