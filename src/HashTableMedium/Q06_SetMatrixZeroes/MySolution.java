package HashTableMedium.Q06_SetMatrixZeroes;

import java.util.HashSet;

public class MySolution {
    public static void main(String[] args) {
        MySolution mySolution = new MySolution();
        mySolution.setZeroes(new int[][]{{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}});
    }

    public void setZeroes(int[][] matrix) {
        HashSet<Integer> rowList = new HashSet<>();
        HashSet<Integer> columnList = new HashSet<>();
        int rowLength = matrix.length;
        int columnLength = matrix[0].length;
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < columnLength; j++) {
                if (matrix[i][j] == 0) {
                    rowList.add(i);
                    columnList.add(j);
                }
            }
        }
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < columnLength; j++) {
                if (rowList.contains(i) || columnList.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
