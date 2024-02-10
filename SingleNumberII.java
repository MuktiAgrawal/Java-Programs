
import java.util.Arrays;

public class SingleNumberII {
    public int singleNumber(int[] nums) {
        // Using XOR + AND combination
        int ones = 0;
        int twos = 0;
        for (int ele : nums) {
            ones = (ones ^ ele) & (~twos);
            twos = (twos ^ ele) & (~ones);
        }
        return ones;

        /*
         * // Counting SET-BIT
         * int n = nums.length;
         * int ans = 0;
         * int shift = 1;
         * for (int i = 0; i < 32; ++i) {
         * int count = 0;
         * for (int ele : nums) {
         * if ((ele & shift) != 0)
         * count += 1;
         * }
         * if (count % 3 != 0)
         * ans += shift;
         * shift *= 2;
         * }
         * return ans;
         */

        /*
         * // SORTING
         * int n = nums.length;
         * if (n < 3)
         * return nums[0];
         * 
         * Arrays.sort(nums);
         * if (nums[0] != nums[1])
         * return nums[0];
         * int i = 1;
         * while (i < n) {
         * if (nums[i] != nums[i - 1])
         * return nums[i - 1];
         * i += 3;
         * }
         * return nums[n - 1];
         */
    }

    public static void main(String[] args) {
        // Example usage
        Solution solution = new Solution();
        int[] nums = { 2, 2, 3, 2, 3, 3, 1 };
        int result = solution.singleNumber(nums);
        System.out.println(result);
    }
}
