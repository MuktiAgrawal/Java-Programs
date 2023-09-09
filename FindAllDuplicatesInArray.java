import java.util.*;

public class FindAllDuplicatesInArray {
    public List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] == nums[correct]) {
                i++;
            } else {
                swap(nums, i, correct);
            }
        }
        List<Integer> res = new ArrayList<Integer>();
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                res.add(nums[i]);
            }
        }
        return res;
    }

    public void swap(int arr[], int ind1, int ind2) {
        int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }
}