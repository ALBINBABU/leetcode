package LeetCode75.Q14_MaximumAverageSubarray;

public class MySolution {
    public static void main(String[] args) {
        MySolution mySolution = new MySolution();
        int[] nums = {1, 12, -5, -6, 50, 3};
        mySolution.findMaxAverage(nums, 4);
    }

    public double findMaxAverage(int[] nums, int k) {
        int arrayLength = nums.length;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        if (arrayLength <= k) {
            for (int value : nums) {
                sum += value;
            }
            return (double) sum / arrayLength;
        } else {
            for (int i = 0; i < arrayLength; i++) {
                if (i < k) {
                    sum += nums[i];
                    if (i == k - 1) {
                        maxSum = Math.max(maxSum, sum);
                    }
                } else {
                    sum = sum + nums[i] - nums[i - k];
                    maxSum = Math.max(maxSum, sum);
                }
            }
            return (double) maxSum / k;
        }
    }
}


