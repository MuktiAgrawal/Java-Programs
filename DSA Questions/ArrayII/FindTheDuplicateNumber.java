
public class FindTheDuplicateNumber {

    // Using cyclic sort
    public int findDuplicate(int[] nums) {
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

    // Using fast and slow pointer to detect cycle
    // Linked list cycle approach
    public int findDuplicate2(int[] nums) {
        int slow = nums[0], fast = nums[0];
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
        // slow and fast collided in cycle, now need to find the start of cycle
        fast = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
