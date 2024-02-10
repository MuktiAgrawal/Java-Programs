import java.util.*;

public class findAllNumbersDisappeared {
    public List<Integer> findDisappearedNumbers(int[] nums) {
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
        i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1) {
                res.add(i + 1);
            }
            i++;
        }
        return res;
    }

    public void swap(int arr[], int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
