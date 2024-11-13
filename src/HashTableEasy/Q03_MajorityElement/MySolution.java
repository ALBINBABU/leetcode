package HashTableEasy.Q03_MajorityElement;

import java.util.HashMap;

public class MySolution {
    public static void main(String[] args) {
        MySolution mySolution = new MySolution();
        mySolution.majorityElement(new int[]{1});
    }

    public int majorityElement(int[] nums) {
        int arrayLength = nums.length;
        HashMap<Integer, Integer> result = new HashMap<>();
        int i = 0;
        while (i < arrayLength) {
            if (result.containsKey(nums[i])) {
                result.put(nums[i], result.get(nums[i]) + 1);
                if (result.get(nums[i]) > arrayLength / 2) {
                    return nums[i];
                }
            } else {
                result.put(nums[i], 1);
            }
            i++;
        }
        return nums[0];
    }
}
