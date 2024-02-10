import java.util.Arrays;

public class HeapSort1 {
    public static void heapSort(int[] arr) {
        int n = arr.length;
        // Build a max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        // Extract elements from the heap one by one
        for (int i = n - 1; i > 0; i--) {
            // Move the current root (max element) to the end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            // Call heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    public static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, largest);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}