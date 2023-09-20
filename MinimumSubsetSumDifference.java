
/* https://www.geeksforgeeks.org/partition-a-set-into-two-subsets-such-that-the-difference-of-subset-sums-is-minimum/ */
import java.util.ArrayList;

class MinimumSubsetSumDifference {
    public static void main(String[] args) {
        int arr[] = { 1, 5, 4, 6, 11 };
        System.out.println(minimumDiff(arr, arr.length));
    }

    public static boolean subsetSum(int[] arr, int sum, int n) {
        boolean t[][] = new boolean[n + 1][sum + 1];
        for (int i = 0; i < n + 1; i++) {
            t[i][0] = true;
        }
        for (int i = 1; i < sum + 1; i++) {
            t[0][i] = false;
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                if (arr[i - 1] <= j) {
                    t[i][j] = t[i - 1][j] || t[i - 1][j - arr[i - 1]];
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        return t[n][sum];
    }

    public static int minimumDiff(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        int min = Integer.MAX_VALUE;
        ArrayList<Integer> ls = new ArrayList<Integer>();
        for (int i = 0; i <= sum / 2; i++) {
            if (subsetSum(arr, i, n) == true)
                ls.add(i);
        }
        for (int i = 0; i < ls.size(); i++) {
            min = Math.min(min, sum - 2 * ls.get(i));
        }
        return min;
    }
}