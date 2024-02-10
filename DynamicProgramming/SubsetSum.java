/* https://www.geeksforgeeks.org/subset-sum-problem-dp-25/ */
/**
 * Given a set of non-negative integers and a value sum, the task is to check if
 * there is a subset of the given set whose sum is equal to the given sum.
 */
public class SubsetSum {
    public static void main(String[] args) {
        int arr[] = { 3, 34, 4, 12, 5, 2 };
        int sum = 9;
        System.out.println(subset(arr, sum));
    }

    public static boolean subset(int arr[], int sum) {
        int n = arr.length;
        boolean t[][] = new boolean[n + 1][sum + 1];

        // Initialization of t matrix
        for (int i = 0; i < n + 1; i++) {
            t[i][0] = true;
        }
        for (int i = 1; i < sum + 1; i++) {
            t[0][i] = false;
        }
        // Iterative solution
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                if (arr[i - 1] <= j) {
                    t[i][j] = t[i - 1][j - arr[i - 1]] || t[i - 1][j];
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        return t[n][sum];
    }
}
