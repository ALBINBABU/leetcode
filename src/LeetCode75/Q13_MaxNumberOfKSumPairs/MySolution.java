package LeetCode75.Q13_MaxNumberOfKSumPairs;

public class MySolution {
    public static void main(String[] args) {
        MySolution mySolution = new MySolution();
        int[] nums = {4, 4, 1, 3, 1, 3, 2, 2, 5, 5, 1, 5, 2, 1, 2, 3, 5, 4};
        mySolution.maxOperations(nums, 2);
    }

    public int maxOperations(int[] nums, int k) {
        int numberOfOperation = 0;
        int arrayLength = nums.length;
        for (int i = 0; i < arrayLength - 1; i++) {
            if (nums[i] < k) {
                for (int j = i + 1; j < arrayLength; j++) {
                    if ((nums[i] + nums[j] == k)) {
                        System.arraycopy(nums, i + 1, nums, i, j - i - 1);
                        if (j < arrayLength - 1) {
                            System.arraycopy(nums, j + 1, nums, j - 1, arrayLength - j - 1);
                        }
                        numberOfOperation++;
                        arrayLength = arrayLength - 2;
                        i--;
                        break;
                    }
                }
            }
        }
        return numberOfOperation;
    }
}
