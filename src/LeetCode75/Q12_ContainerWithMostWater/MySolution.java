package LeetCode75.Q12_ContainerWithMostWater;

public class MySolution {
    public static void main(String[] args) {
        MySolution mySolution = new MySolution();
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        mySolution.maxArea(height);
    }

    public int maxArea(int[] height) {
        int begin = 0;
        int end = height.length - 1;
        int maxArea = 0;
        int currentArea = 0;
        while (begin < end) {
            currentArea = Math.min(height[begin], height[end]) * (end - begin);
            if (maxArea < currentArea)
                maxArea = currentArea;
            if (height[begin] < height[end])
                begin++;
            else
                end--;
        }
        return maxArea;
    }
}
