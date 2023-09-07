
// Time complexity: O(n) 
import java.util.Arrays;

public class CycleSort {
    static void cycleSort(int arr[]) {
        int i = 0;
        // while (i < arr.length) {
        // if (arr[i] - 1 == i) {
        // i++;
        // } else {
        // swap(arr, i, arr[i] - 1);
        // }
        // }

        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] == arr[correct]) {
                i++;
            } else {
                swap(arr, i, correct);
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
