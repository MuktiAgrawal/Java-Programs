import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        // variation2_naive(5);
        variation2_optimized(5);
        variation3(5);
    }

    // Leetcode 118
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ls = new ArrayList<List<Integer>>();
        List<Integer> t = new ArrayList<Integer>();
        t.add(1);
        ls.add(t);
        for (int i = 2; i < numRows + 1; i++) {
            List<Integer> temp = new ArrayList<Integer>();
            temp.add(ls.get(i - 2).get(0));
            for (int j = 1; j < i - 1; j++) {
                temp.add(ls.get(i - 2).get(j - 1) + ls.get(i - 2).get(j));
            }
            temp.add(ls.get(i - 2).get(i - 2));
            ls.add(temp);
        }
        return ls;
    }

    // Leetcode Optimized
    public List<List<Integer>> generate2(int numRows) {
        List<List<Integer>> ls = new ArrayList<List<Integer>>();
        List<Integer> t = new ArrayList<Integer>();
        for (int i = 1; i <= numRows; i++) {
            List<Integer> temp = new ArrayList<Integer>();
            int res = 1;
            for (int c = 0; c < i; c++) {
                if (c == 0) {
                    temp.add(1);
                    continue;
                }
                res *= (i - c);
                res /= c;
                temp.add(res);
            }
            ls.add(temp);
        }
        return ls;
    }
    // Variation 1
    // Find element at n th row and nth col
    // nCr n!/r!*(n-r)! it can be optimized

    public static int variation1(int n, int r) {
        int result = 1;
        for (int i = 0; i < r; i++) {
            result *= (n - i);
            result /= (i + 1);
        }
        return result;
    }

    // Variation 2
    // Print all elements of nth row
    // Naive approach
    public static void variation2_naive(int n) {
        for (int c = 1; c <= n; c++) {
            System.out.print(variation1(n - 1, c - 1) + " ");
        }
    }

    // Optimized approach
    public static void variation2_optimized(int n) {
        int res = 1;
        for (int c = 0; c < n; c++) {
            if (c == 0) {
                System.out.print(1 + " ");
                continue;
            }
            res *= (n - c);
            res /= c;
            System.out.print(res + " ");
        }
        System.out.println();
    }

    // Variation 3
    // Print all elements till nth row
    // Naive approach: Use a loop with variation 2 naive making it O(n^3) time
    // complexity
    // Optimized approach: Use a loop with variation 2 optimized

    public static void variation3(int n) {
        for (int r = 1; r <= n; r++) {
            variation2_optimized(r);
        }
    }
}
