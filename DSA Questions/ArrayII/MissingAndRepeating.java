public class MissingAndRepeating {

    // Problem statement
    // You are given an array of ‘N’ integers where each integer value is between
    // ‘1’ and ‘N’.
    // Each integer appears exactly once except for ‘P’, which appears exactly
    // twice, and ‘Q’, which is missing.
    // Your task is to find ‘P’ and ‘Q’ and return them respectively.

    public static int[] findMissingRepeatingNumbers(int[] a) {
        // Using maths
        long n = a.length;
        long sn = (n * (n + 1)) / 2;
        long sn2 = (n * (n + 1) * (2 * n + 1)) / 6;
        long s = 0, s2 = 0;
        for (int i : a) {
            s += i;
            s2 += (long) i * (long) i;
        }
        // s-sn=x-y
        // var1= x-y
        long var1 = s - sn;

        // s2-sn2=x^2-y^2
        // var2=x+y
        long var2 = (s2 - sn2) / var1;
        long x = ((var1 + var2) / 2);
        long y = var2 - x;
        int ans[] = { (int) x, (int) y };
        return ans;
    }

    // return missing and repeating number in this order
    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // Using XOR
        int num = 0;
        for (int i = 1; i <= n; i++) {
            num ^= i;
            num ^= arr.get(i - 1);
        }
        // num=x^y
        int bitNo = num & ~(num - 1);
        int zero = 0, one = 0;
        // for all array elements
        for (int i = 0; i < n; i++) {
            if ((arr.get(i) & bitNo) == 0) {
                zero ^= arr.get(i);
            } else {
                one ^= arr.get(i);
            }
        }
        // for numbers between 1 and N
        for (int i = 1; i <= n; i++) {
            if ((i & bitNo) == 0) {
                zero ^= i;
            } else {
                one ^= i;
            }
        }
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == zero) {
                cnt++;
            }
        }
        if (cnt == 2) {
            return new int[] { one, zero };
        }
        return new int[] { zero, one };
    }
}
