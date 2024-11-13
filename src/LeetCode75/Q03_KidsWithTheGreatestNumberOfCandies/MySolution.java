package LeetCode75.Q03_KidsWithTheGreatestNumberOfCandies;

import java.util.ArrayList;
import java.util.List;

public class MySolution {
    public static void main(String[] args) {
        MySolution mySolution = new MySolution();
        mySolution.kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3);
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maxValue = 0;
        for (int value : candies) {
            maxValue = Math.max(maxValue, value);
        }
        for (int candy : candies) {
            result.add(candy + extraCandies >= maxValue);
        }
        return result;
    }
}
