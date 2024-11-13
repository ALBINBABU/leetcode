package HashTableEasy.Q10_IntersectionOfTwoArrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MySolution {
    public static void main(String[] args) {
        MySolution mySolution = new MySolution();
        mySolution.intersection(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4});
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int num1Length = nums1.length;
        int num2Length = nums2.length;
        Set<Integer> values = new HashSet<>();
        int i = 0;
        int j = 0;
        while (i < num1Length && j < num2Length) {
            if (nums1[i] == nums2[j]) {
                values.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return values.stream().mapToInt(Integer::intValue).toArray();
    }
}
