package HashTableEasy.Q05_ContainsDuplicate;

import java.util.HashSet;
import java.util.Set;

public class MySolution {
    public static void main(String[] args) {
        MySolution mySolution = new MySolution();
        mySolution.containsDuplicate(new int[]{1, 2, 3, 1});
    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            if (!numSet.add(num))
                return true;
        }
        return false;
    }
}
