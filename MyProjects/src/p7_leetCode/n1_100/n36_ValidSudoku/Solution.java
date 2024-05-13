package p7_leetCode.n1_100.n36_ValidSudoku;

import java.util.HashSet;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int r = 0; r < 9; r++) {
            HashSet<Character> col = new HashSet<>();
            HashSet<Character> row = new HashSet<>();
            HashSet<Character> box = new HashSet<>();
            for (int c = 0; c < 9; c ++) {
                if (board[r][c] != '.' && !col.add(board[r][c])) {
                    return false;
                }
                if (board[c][r] != '.' && !row.add(board[c][r])) {
                    return false;
                }
                int boxR = 3*(r/3);
                int boxJ = 3*(r%3);
                if(board[boxR + c/3][boxJ + c%3]!='.' && !box.add(board[boxR + c/3][boxJ + c%3])) {
                    return false;
                }
            }
        }
        return true;
    }
}
