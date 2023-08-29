/* https://leetcode.com/problems/search-a-2d-matrix-ii/description/ */
public class Search2DMatrixII {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0, col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            int ele = matrix[row][col];
            if (ele == target) {
                return true;
            } else if (ele < target) {
                row++;
            } else {
                col--;
            }
        }
        return false;
    }
}