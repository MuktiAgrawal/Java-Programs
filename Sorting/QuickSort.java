import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 7, 2, 6, 4 };
        quickSort2(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static int partition(int[] array, int start, int end) {
        int pivot = end;
        int i = start - 1;
        for (int j = start; j < end; j++) {
            if (array[j] < array[pivot]) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[pivot];
        array[pivot] = temp;
        return i + 1;
    }

    public static void quickSort(int[] array, int start, int end) {
        if (start < end) {
            int pivot = partition(array, start, end);
            quickSort(array, start, pivot - 1);
            quickSort(array, pivot + 1, end);
        }
    }

    public static void printArray(int arr[]) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort2(int arr[], int low, int high) {
        if (low >= high) {
            return;
        }
        int s = low, e = high;
        int m = s + (e - s) / 2;
        int p = arr[m];
        while (s <= e) {
            while (arr[s] < p) {
                s++;
            }
            while (arr[e] > p) {
                e--;
            }
            if (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        quickSort2(arr, low, e);
        quickSort2(arr, s, high);
    }
}
