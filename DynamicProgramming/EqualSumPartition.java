package DynamicProgramming;
/* https://www.geeksforgeeks.org/partition-problem-dp-18/ */

/* https://leetcode.com/problems/partition-equal-subset-sum/ */

/**
 * Given an integer array nums, return true if you can partition the array into
 * two subsets such that the sum of the elements in both subsets is equal or
 * false otherwise.
 */

public class EqualSumPartition {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if (sum % 2 != 0)
            return false;
        return subsetSum(nums, sum / 2, nums.length);
    }

    public boolean subsetSum(int nums[], int sum, int n) {
        boolean t[][] = new boolean[n + 1][sum + 1];
        // Initialization of t matrix
        for (int i = 0; i < n + 1; i++) {
            t[i][0] = true;
        }
        for (int i = 1; i < sum + 1; i++) {
            t[0][i] = false;
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                if (nums[i - 1] <= j) {
                    t[i][j] = t[i - 1][j - nums[i - 1]] || t[i - 1][j];
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        return t[n][sum];
    }
}