public class CountSort {
    public static void countSort(int[] arr) {
        int n = arr.length;
        int max = arr[0], min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        int range = max - min + 1;
        int[] countArray = new int[range];
        // Initialize count array
        for (int i = 0; i < n; i++) {
            countArray[arr[i] - min]++;
        }
        // Find cumulative sum for each element in count array
        for (int i = 1; i < range; i++) {
            countArray[i] += countArray[i - 1];
        }
        int[] sortedArray = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            sortedArray[countArray[arr[i] - min] - 1] = arr[i];
            countArray[arr[i] - min]--;
        }
        System.arraycopy(sortedArray, 0, arr, 0, n);
    }

    public static void main(String[] args) {
        int arr[] = { 6, 7, 4, 3, 1 };
        countSort(arr);
        printArray(arr);
    }

    public static void printArray(int arr[]) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}