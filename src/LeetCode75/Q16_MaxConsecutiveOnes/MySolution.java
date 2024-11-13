package LeetCode75.Q16_MaxConsecutiveOnes;

import java.util.ArrayList;
import java.util.List;

public class MySolution {
    public static void main(String[] args) {
        MySolution mySolution = new MySolution();
        mySolution.longestOnes(new int[]{0, 1, 1}, 0);
    }

    public int longestOnes(int[] nums, int k) {
        int arrayLength = nums.length;
        List<Integer> indexList = new ArrayList<>();
        for (int i = 0; i < arrayLength; i++) {
            if (nums[i] == 0) {
                indexList.add(i);
            }
        }
        int indexListSize = indexList.size();
        int result = 0;
        if (indexListSize > 0 && indexListSize > k) {
            for (int i = 0; i < indexListSize - k; i++) {
                if (i == 0) {
                    if (indexListSize == 1) {
                        result = arrayLength - 1;
                    } else {
                        result = indexList.get(i + k);
                    }
                } else if (i + k < indexListSize - 1) {
                    result = Math.max(result, indexList.get(i + k) - indexList.get(i - 1) - 1);
                } else {
                    result = Math.max(result, arrayLength - indexList.get(i) - 1);
                }
            }
        } else {
            result = arrayLength;
        }
        return result;
    }
}
