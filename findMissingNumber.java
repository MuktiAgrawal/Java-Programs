/*Program to find missing number from an array of natural numbers */
public class findMissingNumber {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 8, 9, 10 };
        int len = arr.length;
        System.out.println("Missing number is " + number_missing(arr, len));
    }

    public static int number_missing(int arr[], int len) {
        int sum = 0;
        for (int i = 0; i < len; i++)
            sum += arr[i];
        int sum2 = ((len + 1) * (len + 2)) / 2;
        return sum2 - sum;
    }

    // Using cycle sort
    public int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            // if(nums[i]==nums.length){
            // i++;
            // continue;
            // }
            int correct = nums[i];

            if (nums[i] < nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        i = 0;
        while (i < nums.length) {
            if (nums[i] != i) {
                return i;
            }
            i++;
        }
        return i; // the last element n
    }

    public void swap(int arr[], int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}