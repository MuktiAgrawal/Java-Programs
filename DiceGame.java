import java.util.*;

public class MazeSolver {

    private static final int[][] DIRECTIONS = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

    public static List<List<Integer>> solveMaze(int[][] maze) {
        List<List<Integer>> path = new ArrayList<>();
        int startRow = 0;
        int startCol = 0;
        int endRow = maze.length - 1;
        int endCol = maze[0].length - 1;
        solveMaze(maze, startRow, startCol, path);
        return path;
    }

    private static void solveMaze(int[][] maze, int row, int col, List<List<Integer>> path) {
        if (row < 0 || row >= maze.length || col < 0 || col >= maze[0].length || maze[row][col] == 1) {
            return;
        }

        if (row == endRow && col == endCol) {
            path.add(new ArrayList<>(Arrays.asList(row, col)));
            return;
        }

        for (int[] direction : DIRECTIONS) {
            int nextRow = row + direction[0];
            int nextCol = col + direction[1];
            solveMaze(maze, nextRow, nextCol, path);
        }
    }
}
