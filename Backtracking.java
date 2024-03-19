
public class Backtracking {
    public static void main(String[] args) {
        int n = 2;
        boolean board[][] = new boolean[n][n];
        // System.out.println(queens(board, 0));
        // System.out.println(queens2(board, 0, 0, 0));
        System.out.println(nknight(board, 0, 0, n));
        // knight(board, 0, 0, n);
    }

    // no. of ways in which n queens can be placed in a n*n board
    static int queens(boolean board[][], int r) {
        int count = 0;
        if (r == board.length) {
            display(board, "Q ");
            System.out.println();
            return 1;
        }
        for (int col = 0; col < board.length; col++) {
            // place the queen if it is safe
            if (isValid(board, r, col)) {
                board[r][col] = true;
                count += queens(board, r + 1);
                board[r][col] = false;
            }
        }
        return count;
    }

    // without using for loop
    static int queens2(boolean board[][], int r, int c, int queens) {
        if (queens == board.length) {
            display(board, "Q ");
            return 1;
        }
        if (r == board.length) {
            return 0;
        }
        if (c == board.length) {
            return queens2(board, r + 1, 0, queens);
        }
        int count = 0;
        if (isValid(board, r, c)) {
            board[r][c] = true;
            count += queens2(board, r + 1, 0, queens + 1);
            board[r][c] = false;
        }
        count += queens2(board, r, c + 1, queens);
        return count;
    }

    static boolean isValid(boolean board[][], int r, int c) {
        // System.out.println("r=" + r + "c=" + c);
        for (int i = 0; i < r; i++) {
            if (board[i][c]) {
                return false;
            }
        }
        // System.out.println("Upper valid");
        int count = Math.min(r, c);
        for (int i = 1; i <= count; i++) {
            if (board[r - i][c - i]) {
                return false;
            }
        }
        // System.out.println("Left diagonal valid");
        count = Math.min(r, board.length - c - 1);
        for (int i = 1; i <= count; i++) {
            if (board[r - i][c + i]) {
                return false;
            }
        }
        // System.out.println("right diagonal valid");
        return true;
    }

    private static void display(boolean[][] board, String ele) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element) {
                    System.out.print(ele);
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    // N Knights
    static int nknight(boolean[][] board, int r, int c, int knights) {
        if (knights == 0) {
            display(board, "K ");
            System.out.println();
            return 1;
        }
        if (r == board.length - 1 && c == board.length) {
            return 0;
        }
        int count = 0;
        if (c == board.length) {
            count += nknight(board, r + 1, 0, knights);
            return count;
        }
        if (isSafe(board, r, c)) {
            board[r][c] = true;
            count += nknight(board, r, c + 1, knights - 1);
            board[r][c] = false;
        }
        count += nknight(board, r, c + 1, knights);
        return count;
    }

    static boolean isSafe(boolean[][] board, int r, int c) {
        if (isValidKnights(board, r - 2, c - 1)) {
            if (board[r - 2][c - 1]) {
                return false;
            }
        }
        if (isValidKnights(board, r - 2, c + 1)) {
            if (board[r - 2][c + 1]) {
                return false;
            }
        }
        if (isValidKnights(board, r - 1, c - 2)) {
            if (board[r - 1][c - 2]) {
                return false;
            }
        }
        if (isValidKnights(board, r - 1, c + 2)) {
            if (board[r - 1][c + 2]) {
                return false;
            }
        }
        return true;
    }

    static void knight(boolean[][] board, int row, int col, int knights) {
        if (knights == 0) {
            display(board, "K ");
            System.out.println();
            return;
        }

        if (row == board.length - 1 && col == board.length) {
            return;
        }

        if (col == board.length) {
            knight(board, row + 1, 0, knights);
            return;
        }

        if (isSafe(board, row, col)) {
            board[row][col] = true;
            knight(board, row, col + 1, knights - 1);
            board[row][col] = false;
        }

        knight(board, row, col + 1, knights);
    }

    static boolean isValidKnights(boolean[][] board, int r, int c) {
        if (r >= 0 && r < board.length && c >= 0 && c < board.length) {
            return true;
        }
        return false;
    }
}
