package HashTableMedium.Q04_ValidSudoku;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MySolution {
    public static void main(String[] args) {
        MySolution mySolution = new MySolution();
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        mySolution.isValidSudoku(board);
    }

    public boolean isValidSudoku(char[][] board) {
        Map<Integer, List<Character>> rowCharacters = new HashMap<>();
        Map<Integer, List<Character>> columnCharacters = new HashMap<>();
        Map<Integer, List<Character>> boxCharacters = new HashMap<>();
        int index;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (!addIntoMap(rowCharacters, i, board[i][j]) || !addIntoMap(columnCharacters, i, board[j][i])) {
                    return false;
                }
                index = (i / 3) * 3 + j / 3;
                if (!addIntoMap(boxCharacters, index, board[i][j])) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean addIntoMap(Map<Integer, List<Character>> map, int index, char value) {
        List<Character> characterList;
        characterList = map.getOrDefault(index, new ArrayList<>());
        if (characterList.contains(value)) {
            return false;
        }
        if (value != '.') {
            characterList.add(value);
            map.put(index, characterList);
        }
        return true;
    }
}
