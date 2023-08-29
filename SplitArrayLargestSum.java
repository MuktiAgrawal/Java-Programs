/* https://leetcode.com/problems/split-array-largest-sum/ */
/* Time complexity: O(log(sum-max+1)*n) */

public class SplitArrayLargestSum {
    public int splitArray(int[] nums, int k) {
        int end = 0, start = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            end += nums[i];
            start = Math.max(nums[i], start);
        }
        while (start < end) {
            int mid = start + (end - start) / 2;
            int sum = 0, pieces = 1;
            for (int num : nums) {
                if (sum + num > mid) {
                    pieces++;
                    sum = num;
                } else {
                    sum += num;
                }
            }
            if (pieces <= k) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }
}