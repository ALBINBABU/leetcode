package HashTableEasy.Q01_TwoSum;

public class MySolution {
    public static void main(String[] args) {
        MySolution mySolution = new MySolution();
        mySolution.twoSum(new int[]{-1, -2, -3, -4, -5}, -8);
    }

    public int[] twoSum(int[] nums, int target) {
        int arrayLength = nums.length;
        int i = 0;
        int j;
        while (i < arrayLength) {
            j = i + 1;
            while (j < arrayLength) {
                if (nums[i] + nums[j] == target)
                    return new int[]{i, j};
                j++;
            }
            i++;
        }
        return new int[]{};
    }
}
