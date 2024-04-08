public class RotateImage {
    public void rotate(int[][] matrix) {
        // For every square n/2
        // For every outer 1 square, perform 4 operations 3 times
        int n = matrix.length;
        for (int layer = 0; layer < n / 2; layer++) {
            int first = layer, last = n - layer - 1;
            for (int i = first; i < last; i++) {
                int temp = matrix[first][i];
                matrix[first][i] = matrix[n - i - 1][first];
                matrix[n - i - 1][first] = matrix[last][n - 1 - i];
                matrix[last][n - 1 - i] = matrix[i][last];
                matrix[i][last] = temp;
            }
        }
        return;
    }

    public void rotate2(int[][] matrix) {

        int n = matrix.length;

        // First transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // Reverse each row
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - j - 1];
                matrix[i][n - j - 1] = temp;
            }
        }
    }
}
