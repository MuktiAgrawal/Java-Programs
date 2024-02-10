public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = { 6, 7, 4, 3, 1 };
        bubblesortOptimized(arr);
        printArray(arr);
    }

    // Best case Complexity O(n*n)
    void bubblesort(int arr[]) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Best case Complexity O(n)
    static void bubblesortOptimized(int arr[]) {
        int len = arr.length;
        int flag;
        for (int i = 0; i < len - 1; i++) {
            flag = 0;
            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = 1;
                }
            }
            if (flag == 0)
                break;
        }
    }

    static void printArray(int arr[]) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
