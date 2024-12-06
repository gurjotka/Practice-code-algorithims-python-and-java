from typing import List

class Solution:
    def solveSudoku(self, board: List[List[str]]) -> None:
        n = 9  # Board size is always 9x9 for a standard Sudoku.

        # Function to check if placing `ch` in `board[row][col]` is valid.
        def isValid(row, col, ch):
            for i in range(9):
                # Check if `ch` is in the same column or row.
                if board[i][col] == ch or board[row][i] == ch:
                    return False

                # Check if `ch` is in the same 3x3 sub-grid.
                if board[3 * (row // 3) + i // 3][3 * (col // 3) + i % 3] == ch:
                    return False

            return True

        # Recursive function to solve the Sudoku.
        def solve(row, col):
            if row == n:  # If we’ve reached past the last row, the board is solved.
                return True
            if col == n:  # Move to the next row if we’ve reached the last column.
                return solve(row + 1, 0)

            if board[row][col] == ".":  # If the cell is empty, try all possible numbers.
                for i in range(1, 10):
                    if isValid(row, col, str(i)):
                        board[row][col] = str(i)  # Place the number.

                        if solve(row, col + 1):  # Recurse to the next cell.
                            return True
                        board[row][col] = "."  # Backtrack if placing `i` doesn't work.
                return False  # Return False if no valid number can be placed.
            else:
                return solve(row, col + 1)  # Move to the next cell if the current cell is filled.

        solve(0, 0)  # Start solving from the top-left corner.

# Input board.
board = [
    ["5", "3", ".", ".", "7", ".", ".", ".", "."],
    ["6", ".", ".", "1", "9", "5", ".", ".", "."],
    [".", "9", "8", ".", ".", ".", ".", "6", "."],
    ["8", ".", ".", ".", "6", ".", ".", ".", "3"],
    ["4", ".", ".", "8", ".", "3", ".", ".", "1"],
    ["7", ".", ".", ".", "2", ".", ".", ".", "6"],
    [".", "6", ".", ".", ".", ".", "2", "8", "."],
    [".", ".", ".", "4", "1", "9", ".", ".", "5"],
    [".", ".", ".", ".", "8", ".", ".", "7", "9"]
]

# Solve the Sudoku puzzle and print the result.
solution = Solution()
solution.solveSudoku(board)

# Print the solved board.
print(board)
