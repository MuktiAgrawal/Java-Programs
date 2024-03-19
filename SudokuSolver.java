public class SudokuSolver {
    public static void main(String[] args) {
        String[][] board = {
                { "5", "3", ".", ".", "7", ".", ".", ".", "." },
                { "6", ".", ".", "1", "9", "5", ".", ".", "." },
                { ".", "9", "8", ".", ".", ".", ".", "6", "." },
                { "8", ".", ".", ".", "6", ".", ".", ".", "3" },
                { "4", ".", ".", "8", ".", "3", ".", ".", "1" },
                { "7", ".", ".", ".", "2", ".", ".", ".", "6" },
                { ".", "6", ".", ".", ".", ".", "2", "8", "." },
                { ".", ".", ".", "4", "1", "9", ".", ".", "5" },
                { ".", ".", ".", ".", "8", ".", ".", "7", "9" }
        };
        if (solveSudoku(board, 0, 0)) {
            display(board);

        } else {
            System.out.println("cannot solve");
        }
    }

    public static boolean solveSudoku(String[][] board, int r, int c) {
        if (r == board.length) {
            return true;
        }
        if (c == board[0].length) {
            return solveSudoku(board, r + 1, 0);
        }
        if (board[r][c] != ".") {
            return solveSudoku(board, r, c + 1);
        }
        for (int j = 1; j <= board.length; j++) {
            if (isSafe(board, r, c, j)) {
                // System.out.println(isSafe(board, r, c, j));
                // System.out.println("r=" + r + "c=" + c + "j=" + j);
                board[r][c] = String.valueOf(j);
                if (solveSudoku(board, r, c + 1)) {
                    return true;
                }
                board[r][c] = ".";
            }
        }
        return false;
    }

    public static boolean isSafe(String[][] board, int r, int c, int digit) {
        for (int i = 0; i < board.length; i++) {
            if (board[r][i].equals(String.valueOf(digit))) {
                return false;
            }
        }
        // System.out.println("Row valid");
        for (int i = 0; i < board.length; i++) {
            if (board[i][c].equals(String.valueOf(digit))) {
                return false;
            }
        }
        // System.out.println("Col valid");
        // for (int i = r / 3 * 3; i < r / 3 * 3 + 3; i++) {
        // for (int j = c / 3 * 3; j < c / 3 * 3 + 3; j++) {
        // if (board[i][j] == String.valueOf(digit)) {
        // return false;
        // }
        // }
        // }
        int sqrt = (int) (Math.sqrt(board.length));
        int rowStart = r - r % sqrt;
        int colStart = c - c % sqrt;

        for (int row = rowStart; row < rowStart + sqrt; row++) {
            for (int col = colStart; col < colStart + sqrt; col++) {
                if (board[row][col].equals(String.valueOf(digit))) {
                    return false;
                }
            }
        }
        // System.out.println("Grid valid");
        return true;
    }

    private static void display(String[][] board) {
        for (String[] row : board) {
            for (String element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    // Leetcode 37

    public void solveSudoku(char[][] board) {
        if (board == null || board.length == 0) {
            return;
        }
        solve(board);
    }

    public boolean solve(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == '.') {
                    for (char k = '1'; k <= '9'; k++) {
                        if (isValid(board, i, j, k)) {
                            board[i][j] = k;
                            if (solve(board))
                                return true;
                            board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isValid(char[][] board, int r, int c, char d) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][c] == d)
                return false;
            if (board[r][i] == d)
                return false;
            if (board[(r / 3) * 3 + i / 3][(c / 3) * 3 + i % 3] == d)
                return false;

        }
        return true;
    }
}
