public class Sort012 {
    public void sortColors(int[] nums) {
        int i = 0, start = 0, end = nums.length - 1;
        while (i <= end) {
            if (nums[i] == 2) {
                swap(nums, i, end);
                // System.out.println(end);
                end--;
            } else if (nums[i] == 0) {
                swap(nums, i, start);
                start++;
                i++;
            } else if (nums[i] == 1)
                i++;
        }
    }

    public void swap(int nums[], int i, int j) {
        // System.out.println(i+" "+j);
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        // System.out.println(Arrays.toString(nums));
    }
}
