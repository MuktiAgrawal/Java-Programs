public class CountInversions {
    static long count = 0;

    public static long getInversions(long arr[], int n) {
        // Write your code here
        mergeSort(arr, 0, n);
        return count;
    }

    public static void merge(long arr[], int low, int mid, int high) {
        long mix[] = new long[high - low];

        int left = low, right = mid, k = 0;
        while (left < mid && right < high) {
            if (arr[left] < arr[right]) {
                mix[k] = arr[left];
                left++;
            } else {
                mix[k] = arr[right];
                count += mid - left;
                right++;
            }
            k++;
        }
        while (left < mid) {
            mix[k++] = arr[left++];
        }
        while (right < high) {
            mix[k++] = arr[right++];
        }
        for (int l = 0; l < mix.length; l++) {
            arr[low + l] = mix[l];
        }
        // System.out.println(Arrays.toString(arr));
        return;
    }

    public static void mergeSort(long arr[], int low, int high) {
        if (high - low == 1) {
            return;
        }
        int mid = low + (high - low) / 2;
        // System.out.println(low+" "+high+" "+mid);
        mergeSort(arr, low, mid);
        mergeSort(arr, mid, high);
        merge(arr, low, mid, high);
    }
}
