package HashTableEasy.Q06_ContainsDuplicateII;

import java.util.HashMap;

public class MySolution {
    public static void main(String[] args) {
        MySolution mySolution = new MySolution();
        mySolution.containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2);
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int arrayLength = nums.length;
        HashMap<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < arrayLength; i++) {
            if (indexMap.containsKey(nums[i]) && (i - indexMap.get(nums[i]) <= k)) {
                return true;
            }
            indexMap.put(nums[i], i);
        }
        return false;
    }
}

