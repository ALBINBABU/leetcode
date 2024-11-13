package LeetCode75.Q10_MoveZeroes;

public class MySolution {
    public static void main(String[] args) {
        MySolution mySolution = new MySolution();
        mySolution.moveZeroes(new int[]{0, 0, 1});
    }

    public void moveZeroes(int[] nums) {
        int lengthOfArray = nums.length - 1;
        int temp;
        for (int i = 0; i < lengthOfArray; i++) {
            for (int j = 0; j < lengthOfArray; j++) {
                if (nums[j] == 0) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }
}

