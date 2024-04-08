public class MaximumSubarraySum {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[] { 1, 2, -5, 6, 7 }));
    }

    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            max = Math.max(max, currSum);
            if (currSum < 0) {
                currSum = 0;
            }
        }
        return max;
    }
}