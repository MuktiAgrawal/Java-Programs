
// Time complexity: O(n) 
import java.util.Arrays;

public class CycleSort {
    static void cycleSort(int nums[]) {
        int i = 0;
        // while (i < nums.length) {
        // if (nums[i] - 1 == i) {
        // i++;
        // } else {
        // swap(nums, i, nums[i] - 1);
        // }
        // }

        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] == nums[correct]) {
                i++;
            } else {
                swap(nums, i, correct);
            }
        }
    }

    static void swap(int arr[], int ind1, int ind2) {
        int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 1, 2 };
        CycleSort.cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
