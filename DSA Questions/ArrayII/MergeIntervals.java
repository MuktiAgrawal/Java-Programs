
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {

    // 1. optimized better (best solution)
    public int[][] merge2(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[0], o2[0]);
            }
        });

        List<int[]> ls = new ArrayList<int[]>();
        int temp[] = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            if (temp[1] >= intervals[i][0]) {
                temp[1] = Math.max(temp[1], intervals[i][1]);
            } else {
                ls.add(temp);
                temp = intervals[i];
            }
        }
        ls.add(temp);
        return ls.toArray(new int[0][]);
        // will store elements of list to a 2-D integer array as specified in above
        // statement and the number of rows are set to 0 so that if the size of list is
        // more than that, it is automatically expanded to that size and type of data
        // structure stays the same
    }

    // 2.
    public int[][] merge(int[][] intervals) {

        // sort the array

        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int a[], int b[]) {
                return a[0] - b[0];
            }
        });
        // convert the array to arraylist and compare every high to next low and merge,
        // now again start
        // from the merged array
        // O(n) time but O(n2)space

        List<List<Integer>> mergedIntervals = new ArrayList<List<Integer>>();
        int pstart = -1, pend = -1;
        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i][0] <= pend) {
                mergedIntervals.remove(mergedIntervals.size() - 1);
                pstart = Math.min(pstart, intervals[i][0]);
                pend = Math.max(pend, intervals[i][1]);
                List<Integer> newInterval = new ArrayList<>();
                newInterval.add(pstart);
                newInterval.add(pend);
                mergedIntervals.add(newInterval);
            } else {
                List<Integer> newInterval = new ArrayList<>();
                newInterval.add(intervals[i][0]);
                newInterval.add(intervals[i][1]);
                mergedIntervals.add(newInterval);
                pstart = intervals[i][0];
                pend = intervals[i][1];
            }
        }
        int[][] mergedIntervalsArray = new int[mergedIntervals.size()][2];

        for (int i = 0; i < mergedIntervals.size(); i++) {
            List<Integer> interval = mergedIntervals.get(i);
            mergedIntervalsArray[i][0] = interval.get(0);
            mergedIntervalsArray[i][1] = interval.get(1);
        }
        return mergedIntervalsArray;
    }

    // 3. Strivers

    public static List<List<Integer>> mergeOverlappingIntervals(int[][] arr) {
        int n = arr.length; // size of the array
        // sort the given intervals:
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            // if the current interval does not
            // lie in the last interval:
            if (ans.isEmpty() || arr[i][0] > ans.get(ans.size() - 1).get(1)) {
                ans.add(Arrays.asList(arr[i][0], arr[i][1]));
            }
            // if the current interval
            // lies in the last interval:
            else {
                ans.get(ans.size() - 1).set(1,
                        Math.max(ans.get(ans.size() - 1).get(1), arr[i][1]));
            }
        }
        return ans;
    }
}
