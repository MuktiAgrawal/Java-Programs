import java.util.Arrays;

public class Recursion {
    public static void main(String[] args) {
        // System.out.println(reverse(1234));
        // triangle(4, 0);
        // triangle2(4, 0);
        int arr[] = { 5, 4, 3, 2, 1 };
        // bubbleSortRecursion(arr, arr.length, 0);
        // System.out.println(Arrays.toString(arr));
        selectionSort(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    public static int reverse(int n) {
        int digits = (int) Math.log10(n) + 1;
        return helper(n, digits - 1);
    }

    public static int helper(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }
        return (n % 10) * (int) Math.pow(10, digits) + helper(n / 10, digits - 1);
    }
    // second way is to take a static sum variable outside the method

    // Pattern question
    // ****
    // ***
    // **
    // *
    public static void triangle(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            System.out.print("*");
            triangle(r, c + 1);
        } else {
            System.out.println();
            triangle(r - 1, 0);
        }
    }

    // *
    // **
    // ***
    // ****
    public static void triangle2(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            triangle2(r, c + 1);
            System.out.print("*");

        } else {
            triangle2(r - 1, 0);
            System.out.println();
        }
    }

    public static void bubbleSortRecursion(int a[], int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r - 1) {
            if (a[c] > a[c + 1]) {
                int temp = a[c];
                a[c] = a[c + 1];
                a[c + 1] = temp;
            }
            bubbleSortRecursion(a, r, c + 1);
        } else {
            bubbleSortRecursion(a, r - 1, 0);
        }
    }

    public static void selectionSort(int a[], int r, int c, int maxIndex) {
        if (r == 0) {
            return;
        }
        if (c < r - 1) {
            if (a[c + 1] > a[maxIndex]) {
                maxIndex = c + 1;
            }
            selectionSort(a, r, c + 1, maxIndex);
        } else {
            int temp = a[r - 1];
            a[r - 1] = a[maxIndex];
            a[maxIndex] = temp;
            selectionSort(a, r - 1, 0, 0);
        }
    }
}
