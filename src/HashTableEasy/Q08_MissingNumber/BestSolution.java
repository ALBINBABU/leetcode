package HashTableEasy.Q08_MissingNumber;

public class BestSolution {
    public static void main(String[] args) {
        BestSolution bestSolution = new BestSolution();
        bestSolution.missingNumber(new int[]{2, 0, 1});
    }

    public int missingNumber(int[] nums) {
        int arrayLength = nums.length;
        int sum = (arrayLength * (arrayLength + 1)) / 2;
        int arraySum = 0;
        for (int value : nums) {
            arraySum += value;
        }
        return sum - arraySum;
    }
}
