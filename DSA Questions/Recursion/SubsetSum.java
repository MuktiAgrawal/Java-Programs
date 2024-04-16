// Given a list arr of n integers, return sums of all subsets in it. Output sums can be printed in any order.

public class SubsetSum {

    // Method 1
    // At every recursive call generate a subset of that length
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int n) {
        // code here
        ArrayList<Integer> sum = new ArrayList<>();
        helper(arr, 0, n, sum, 0);
        return sum;
    }

    void helper(ArrayList<Integer> arr, int ind, int n, ArrayList<Integer> sum, int smallSum) {
        sum.add(smallSum);
        for (int i = ind; i < n; i++) {
            helper(arr, i + 1, n, sum, smallSum + arr.get(i));
        }
    }

    // Method 2
    // Pick and not pick method
    static void subsetSumsHelper(int ind, int sum, ArrayList<Integer> arr, int N, ArrayList<Integer> sumSubset) {
        if (ind == N) {
            sumSubset.add(sum);
            return;
        }

        // pick the element
        subsetSumsHelper(ind + 1, sum + arr.get(ind), arr, N, sumSubset);

        // Do-not pick the element
        subsetSumsHelper(ind + 1, sum, arr, N, sumSubset);
    }

    static ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N) {

        ArrayList<Integer> sumSubset = new ArrayList<>();
        subsetSumsHelper(0, 0, arr, N, sumSubset);
        Collections.sort(sumSubset);
        return sumSubset;
    }

}
