import java.util.Arrays;

public class Solution {
    public void solveSudoku(char[][] board) {
        // Start solving the board using recursion and backtracking
        solve(board);
    }

    private boolean solve(char[][] board) {
        int n = 9; // Standard Sudoku board size
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (board[row][col] == '.') { // Find an empty cell
                    for (char num = '1'; num <= '9'; num++) { // Try all numbers from 1 to 9
                        if (isValid(board, row, col, num)) { // Check if placing num is valid
                            board[row][col] = num; // Place the number

                            // Recurse to solve the rest of the board
                            if (solve(board)) {
                                return true; // Solution found
                            }

                            board[row][col] = '.'; // Backtrack
                        }
                    }
                    return false; // No valid number can be placed, backtrack
                }
            }
        }
        return true; // Board completely solved
    }

    private boolean isValid(char[][] board, int row, int col, char num) {
        for (int i = 0; i < 9; i++) {
            // Check row, column, and 3x3 sub-grid
            if (board[row][i] == num || board[i][col] == num ||
                    board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == num) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Input Sudoku board
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        Solution solution = new Solution();
        solution.solveSudoku(board);
        System.out.println(Arrays.deepToString(board));