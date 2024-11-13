package LeetCode75.Q04_CanPlaceFlowers;

public class MySolution {
    public static void main(String[] args) {
        MySolution mySolution = new MySolution();
        mySolution.canPlaceFlowers(new int[]{0, 0, 1, 0, 0}, 1);
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int flowerbedLength = flowerbed.length;
        int result = 0;
        boolean canPlace = false;
        for (int i = 0; i < flowerbedLength; i++) {
            if (flowerbed[i] == 0) {
                if (flowerbedLength == 1) {
                    canPlace = true;
                } else {
                    if (i == 0) {
                        if (i + 1 < flowerbedLength && flowerbed[i + 1] == 0) {
                            canPlace = true;
                        }
                    } else if (i == flowerbedLength - 1) {
                        if (flowerbed[i - 1] == 0)
                            canPlace = true;
                    } else if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0)
                        canPlace = true;
                }
                if (canPlace) {
                    flowerbed[i] = 1;
                    result++;
                    canPlace = false;
                }
            }
        }
        return result >= n;
    }
}
