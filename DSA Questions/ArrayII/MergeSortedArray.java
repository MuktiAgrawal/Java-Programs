public class MergeSortedArray {

    // When all the elements need to be sorted and stored in one big array num1
    // Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
    // Output: [1,2,2,3,5,6]
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1;
        while (i >= 0 && j >= 0) {
            if (nums2[j] >= nums1[i]) {
                nums1[i + j + 1] = nums2[j];
                j--;
            } else {
                nums1[i + j + 1] = nums1[i];
                i--;
            }
        }
        while (j >= 0) {
            nums1[j] = nums2[j];
            j--;
        }
    }

    // Given two sorted arrays arr1[] and arr2[] of sizes n and m in non-decreasing
    // order. Merge them in sorted order. Modify arr1 so that it contains the first
    // N elements and modify arr2 so that it contains the last M elements.
    // When sorted array needs to be stored in num1 and num2

    // swap elements between a and b by comparing largest element of a with smallest
    // element of b repeatatively
    // when each array contains the correct elements sort them
    // O(min(m,n))+O(m*logm)+O(n*log n)
    public static void mergeTwoSortedArraysWithoutExtraSpace(long[] a, long[] b) {
        // Write your code here.
        int i = a.length - 1, j = 0;
        while (a[i] > b[j] && i >= 0 && j < b.length) {
            long temp = a[i];
            a[i] = b[j];
            b[j] = temp;
            i--;
            j++;
        }
        Arrays.sort(a);
        Arrays.sort(b);
    }

    public static void mergeTwoSortedArraysWithoutExtraSpace(long[] a, long[] b) {

        // gap method
        int gap = (int) Math.ceil((a.length + b.length) / 2.0);

        while (gap > 0) {
            int left = 0, right = left + gap;
            while (right < a.length + b.length) {
                // case 2: both pointers in arr2[]:
                if (left >= a.length) {
                    swapIfGreater(b, b, left - a.length, right - a.length);
                }
                // case 3: both pointers in arr1[]:
                else if (right < a.length) {
                    swapIfGreater(a, a, left, right);
                }
                // case 1: left in arr1[]
                // and right in arr2[]:
                else {
                    swapIfGreater(a, b, left, right - a.length);
                }
                left++;
                right++;
            }
            if (gap == 1)
                break;
            gap = (gap / 2) + (gap % 2);
        }
    }

    public static void swapIfGreater(long[] arr1, long[] arr2, int ind1, int ind2) {
        if (arr1[ind1] > arr2[ind2]) {
            long temp = arr1[ind1];
            arr1[ind1] = arr2[ind2];
            arr2[ind2] = temp;
        }
    }

}
