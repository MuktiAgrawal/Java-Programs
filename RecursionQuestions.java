import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class RecursionQuestions {
    // Subset, subsequence, string questions
    public static void main(String[] args) {
        // String str = "baccad";
        // String ans = skipChar(str, 0);
        // System.out.println(ans);
        // skipChar2("", "baccdah");
        // System.out.println(skipChar3("baccdah"));
        // System.out.println(skipApple("bacapplecaj"));
        // System.out.println(skipAppNotApple("bdappldapple"));
        // System.out.println(subsequence("", "abc"));
        // int arr[] = { 1, 2, 2 };
        // List<List<Integer>> answer = subsets_iter_duplicates(arr);
        // for (List<Integer> ls : answer) {
        // System.out.println(ls);
        // }
        // System.out.println(permutations("", "abc"));
        // System.out.println(countPermutations("", "abc"));
        // System.out.println(letterCombinations("6"));
        // System.out.println(numRollsToTarget(1, 6, 6));
        // System.out.println(countPaths(3, 3, ""));
        // System.out.println(countPaths2(3, 3));
        // System.out.println(countPaths3(3, 3, ""));
        boolean[][] board = {
                { true, true, true },
                { true, true, true },
                { true, true, true },
        };
        // pathRestrictions(board, 0, 0, "");
        // pathRestrictionsAll(board, 0, 0, "");
        int[][] path = new int[board.length][board[0].length];
        pathRestrictionsAll1(board, path, 1, 0, 0, "");
    }

    public static String skipChar(String str, int i) {
        String ans = "";
        if (i == str.length()) {
            return ans;
        }
        if (str.charAt(i) != 'a') {
            ans += str.charAt(i);
        }

        ans += skipChar(str, i + 1);
        return ans;
    }

    // way 2
    // p - processed up- unprocessed
    public static void skipChar2(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        if (up.charAt(0) == 'a') {
            skipChar2(p, up.substring(1));
        } else {
            skipChar2(p + up.charAt(0), up.substring(1));
        }
    }

    // way 3
    static String skipChar3(String up) {
        if (up.isEmpty()) {
            return "";
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            return skipChar3(up.substring(1));
        } else
            return ch + skipChar3(up.substring(1));
    }

    // Skip a string
    static String skipApple(String p) {
        if (p.isEmpty()) {
            return "";
        }
        if (p.startsWith("apple")) {
            return skipApple(p.substring(5));
        } else {
            return p.charAt(0) + skipApple(p.substring(1));
        }
    }

    // Skip a string if it is not a required string
    static String skipAppNotApple(String p) {
        if (p.isEmpty()) {
            return "";
        }
        if (p.startsWith("app") && !p.startsWith("apple")) {
            return skipAppNotApple(p.substring(3));
        } else {
            return p.charAt(0) + skipAppNotApple(p.substring(1));
        }
    }

    // Subsequences
    static ArrayList<String> subsequence(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list; // add p to list
        }

        ArrayList<String> left = subsequence(p + up.charAt(0), up.substring(1));
        ArrayList<String> right = subsequence(p, up.substring(1));
        left.addAll(right);
        return left;
    }

    // Subsets leetcode
    public List<List<Integer>> subsets(int[] nums) {
        return subsetsHelper(new ArrayList<Integer>(), nums, 0);
    }

    public List<List<Integer>> subsetsHelper(List<Integer> ls, int[] nums, int i) {
        if (i == nums.length) {
            List<List<Integer>> list = new ArrayList<List<Integer>>();
            list.add(ls);
            return list;
        }
        List<List<Integer>> right = subsetsHelper(ls, nums, i + 1);
        List<List<Integer>> left = subsetsHelper(new ArrayList<>(ls) {
            {
                add(nums[i]);
            }
        }, nums, i + 1);
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        ans.addAll(left);
        ans.addAll(right);
        return ans;
    }

    // Subset Iterative
    // Time complexity: O(n * 2^n)
    // Space complexity: O(2^n * n) where 2^n are total subsets and n is max. size
    // of a subset
    public static List<List<Integer>> subsets_iter(int[] nums) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int i : nums) {
            int n = outer.size();
            for (int j = 0; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(i);
                outer.add(internal);
            }
        }
        return outer;
    }

    public static List<List<Integer>> subsets_iter_duplicates(int[] nums) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int i = 0; i < nums.length; i++) {
            int j = 0, m = 0;
            if (i > 0 && nums[i] == nums[i - 1]) {
                m = outer.size() / 2;
            }
            int n = outer.size();
            for (j = m; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(nums[i]);
                outer.add(internal);
            }
        }
        return outer;
    }

    // Using Recursion
    static ArrayList<String> permutations(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> ls = new ArrayList<>();
            ls.add(p);
            return ls;
        }
        int size = p.length();
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i <= size; i++) {
            ans.addAll(permutations(p.substring(0, i) + up.charAt(0) + p.substring(i, size),
                    up.substring(1)));
        }
        return ans;
    }

    // count no. of permutations
    static int countPermutations(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return 1;
        }
        int c = 0;
        int size = p.length();
        for (int i = 0; i <= size; i++) {
            c += countPermutations(p.substring(0, i) + up.charAt(0) + p.substring(i, size),
                    up.substring(1));
        }
        return c;
    }

    public static List<String> letterCombinations(String digits) {
        String map[] = { "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        return letterCombinationsHelper(map, "", digits);
    }

    public static List<String> letterCombinationsHelper(String map[], String p, String up) {
        if (up.isEmpty()) {
            List<String> ls = new ArrayList<>();
            ls.add(p);
            return ls;
        }
        List<String> ans = new ArrayList<>();
        // int first = Integer.parseInt(up.charAt(0) + "");
        int first = up.charAt(0) - '0'; // will convert '2' to 2
        if (first == 1) {
            return ans;
        }
        for (int i = 0; i < map[first - 1].length(); i++) {
            ans.addAll(letterCombinationsHelper(map, p + map[first - 1].charAt(i), up.substring(1)));
        }
        return ans;
    }

    // 1155. Number of Dice Rolls With Target Sum
    // n is no. of dice, k is no. of faces on the dice
    final static double MOD = Math.pow(10, 9) + 7;

    public static int numRollsToTarget(int n, int k, int target) {
        if (n == 0) {
            if (target == 0) {
                return 1;
            }
            return 0;
        }
        int count = 0;
        for (int i = 1; i <= k && i <= target; i++) {
            count += numRollsToTarget(n - 1, k, target - i) % MOD;
        }
        return count;
    }

    // [DDRR, DRDR, DRRD, RDDR, RDRD, RRDD] - These are just permutations of 4
    // letters
    public static ArrayList<String> countPaths(int r, int c, String path) {
        if (r == 1 && c == 1) {
            ArrayList<String> ls = new ArrayList<>();
            ls.add(path);
            return ls;
        }
        ArrayList<String> left = new ArrayList<>();
        ArrayList<String> right = new ArrayList<>();
        if (c > 1) {
            left = countPaths(r, c - 1, path + "R");
        }
        if (r > 1) {
            right = countPaths(r - 1, c, path + "D");
        }
        left.addAll(right);
        return left;
    }

    public static int countPaths2(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }
        int count = 0;
        count += countPaths2(r - 1, c);
        count += countPaths2(r, c - 1);
        return count;
    }

    // If diagonal movement is also allowed.
    public static ArrayList<String> countPaths3(int r, int c, String path) {
        if (r == 1 && c == 1) {
            ArrayList<String> ls = new ArrayList<>();
            ls.add(path);
            return ls;
        }
        ArrayList<String> left = new ArrayList<>();
        if (r > 1 && c > 1) {
            left.addAll(countPaths3(r - 1, c - 1, path + "D"));
        }
        if (c > 1) {
            left.addAll(countPaths3(r, c - 1, path + "H"));
        }
        if (r > 1) {
            left.addAll(countPaths3(r - 1, c, path + "V")); // v stands for vertical down
        }
        return left;
    }

    // maze with obstacles
    // starting from 0,0 this time
    public static void pathRestrictions(boolean maze[][], int r, int c, String path) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(path);
            return;
        }
        // obstacle present
        if (!maze[r][c]) {
            return;
        }
        if (r < maze.length - 1) {
            pathRestrictions(maze, r + 1, c, path + "D");
        }
        if (c < maze[0].length - 1) {
            pathRestrictions(maze, r, c + 1, path + "R");
        }
    }

    // movement in all directions allowed.
    public static void pathRestrictionsAll(boolean maze[][], int r, int c, String path) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(path);
            return;
        }
        // obstacle present
        if (!maze[r][c]) {
            return;
        }
        // marking this cell as visited
        maze[r][c] = false;
        // up
        if (r > 0) {
            pathRestrictionsAll(maze, r - 1, c, path + "U");
        }
        // left
        if (c > 0) {
            pathRestrictionsAll(maze, r, c - 1, path + "L");
        }
        // down
        if (r < maze.length - 1) {
            pathRestrictionsAll(maze, r + 1, c, path + "D");
        }
        // right
        if (c < maze[0].length - 1) {
            pathRestrictionsAll(maze, r, c + 1, path + "R");
        }

        // unmarking the cell after function call is returned
        maze[r][c] = true;
    }

    // Print matrix and path
    public static void pathRestrictionsAll1(boolean maze[][], int box[][], int step, int r, int c, String path) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            box[r][c] = step;
            for (int[] arr : box) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(path);
            System.out.println();
            return;
        }
        // obstacle present
        if (!maze[r][c]) {
            return;
        }
        // marking this cell as visited
        maze[r][c] = false;
        box[r][c] = step;
        // up
        if (r > 0) {
            pathRestrictionsAll1(maze, box, step + 1, r - 1, c, path + "U");
        }
        // left
        if (c > 0) {
            pathRestrictionsAll1(maze, box, step + 1, r, c - 1, path + "L");
        }
        // down
        if (r < maze.length - 1) {
            pathRestrictionsAll1(maze, box, step + 1, r + 1, c, path + "D");
        }
        // right
        if (c < maze[0].length - 1) {
            pathRestrictionsAll1(maze, box, step + 1, r, c + 1, path + "R");
        }
        box[r][c] = 0;
        // unmarking the cell after function call is returned
        maze[r][c] = true;
    }
}
