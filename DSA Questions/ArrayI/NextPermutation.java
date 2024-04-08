public class NextPermutation {
    public void nextPermutation(int[] nums) {
        if (nums.length == 1) {
            return;
        }
        int i = -1;
        for (i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                break;
            }
        }
        if (i == -1) {
            reverse(nums, 0, nums.length - 1);
            return;
        }
        int j;
        for (j = nums.length - 1; j > i; j--) {
            if (nums[j] > nums[i]) {
                break;
            }
        }

        // swap
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

        // reverse the right half
        reverse(nums, i + 1, nums.length - 1);
        return;
    }

    public static void reverse(int nums[], int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        return;
    }
}
