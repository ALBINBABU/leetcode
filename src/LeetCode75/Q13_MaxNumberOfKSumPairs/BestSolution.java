package LeetCode75.Q13_MaxNumberOfKSumPairs;

import java.util.Arrays;

public class BestSolution {
    public static void main(String[] args) {
        MySolution mySolution = new MySolution();
        int[] nums = {4, 4, 1, 3, 1, 3, 2, 2, 5, 5, 1, 5, 2, 1, 2, 3, 5, 4};
        mySolution.maxOperations(nums, 2);
    }

    public int maxOperations(int[] nums, int k) {
        int operations = 0;
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            if (nums[left] + nums[right] == k) {
                left++;
                right--;
                operations++;
            } else if ((nums[left] + nums[right]) > k) {
                right--;
            } else {
                left++;
            }
        }
        return operations;
    }
}
