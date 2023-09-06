public class Search2DMatrixI {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        // Perform binary search on row if there is only 1 row.
        if (rows == 1)
            return binarySearch(matrix, 0, 0, cols - 1, target);

        int rStart = 0, rEnd = rows - 1;
        int cMid = cols / 2;
        // This loops runs till 2 rows are left
        while (rStart < rEnd - 1) {
            int rMid = rStart + (rEnd - rStart) / 2;
            if (matrix[rMid][cMid] == target) {
                return true;
            }
            if (matrix[rMid][cMid] < target) {
                rStart = rMid;
            } else {
                rEnd = rMid;
            }
        }
        // Now we have 2 rows in rStart and rEnd
        // we check if target is present in middle of these 2 rows
        if (matrix[rStart][cMid] == target) {
            return true;
        }
        if (matrix[rEnd][cMid] == target) {
            return true;
        }
        // Now we check in which of the 4 parts is the target present and apply binary
        // search on that part

        // 1st part
        if (matrix[rStart][cMid] > target) {
            return binarySearch(matrix, rStart, 0, cMid - 1, target);
        }

        // 2nd part
        if (matrix[rStart][cMid] < target && target < matrix[rEnd][0]) {
            return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);
        }

        // 3rd part
        if (matrix[rEnd][cMid] > target) {
            return binarySearch(matrix, rEnd, 0, cMid - 1, target);
        }

        // 4th part
        if (matrix[rEnd][cMid] < target) {
            return binarySearch(matrix, rEnd, cMid + 1, cols - 1, target);
        }

        return false;
    }

    public boolean binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return true;
                // return new int[]{row,mid};
            }
            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return false;
        // return new int[]{-1,-1};
    }
}