import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = { 6, 7, 4, 3, 1 };
        selectionsort2(arr);
        printArray(arr);
    }

    public static void selectionsort(int arr[]) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < len; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public static void selectionsort2(int arr[]) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            int maxIndex = len - i - 1;
            for (int j = 0; j < len - i; j++) {
                if (arr[j] > arr[maxIndex])
                    maxIndex = j;
            }
            int temp = arr[len - i - 1];
            arr[len - i - 1] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }

    public static void printArray(int arr[]) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
