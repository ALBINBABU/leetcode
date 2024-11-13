package HashTableEasy.Q08_MissingNumber;

import java.util.Arrays;

public class MySolution {
    public static void main(String[] args) {
        MySolution mySolution = new MySolution();
        mySolution.missingNumber(new int[]{2, 0, 1});
    }

    public int missingNumber(int[] nums) {
        int arrayLength = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < arrayLength; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return arrayLength;
    }
}
