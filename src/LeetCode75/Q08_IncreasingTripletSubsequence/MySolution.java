package LeetCode75.Q08_IncreasingTripletSubsequence;

public class MySolution {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, -2, 6};
        System.out.println(increasingTriplet(nums));
    }

    public static boolean increasingTriplet(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num <= min)
                min = num;
            else if (num < max) {
                max = num;
            } else if (num > max) {
                return true;
            }
        }
        return false;
    }
}
