public class findDuplicate {
    public int findDuplicate1(int[] nums) {
        int len = nums.length;
        for (int num : nums) {
            int idx = Math.abs(num);
            if (nums[idx] < 0) {
                return idx;
            }
            nums[idx] = -nums[idx];
        }
        return len;
    }

    public int findDuplicate2(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] == nums[correct]) {
                if (correct != i) {
                    return nums[i];
                }
                i++;
            } else {
                swap(nums, i, correct);
            }
        }
        return -1;
    }

    public void swap(int arr[], int ind1, int ind2) {
        int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }
}
