import java.net.SocketPermission;
import java.util.ArrayList;
import java.util.List;

public class RecursionQuestions {
    // Subset, subsequence, string questions
    public static void main(String[] args) {
        String str = "baccad";
        String ans = skipChar(str, 0);
        System.out.println(ans);
        skipChar2("", "baccdah");
        System.out.println(skipApple("bacapplecaj"));
        System.out.println(skipAppNotApple("bdappldapple"));
        System.out.println(subsequence("", "abc"));
        int arr[] = { 1, 2, 2 };
        List<List<Integer>> answer = subsets_iter_duplicates(arr);
        for (List<Integer> ls : answer) {
            System.out.println(ls);
        }
        System.out.println(permutations("", "abc"));
        System.out.println(countPermutations("", "abc"));
        System.out.println(letterCombinations("12"));
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
            return skipChar3(ch + up.substring(1));
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
        int first = Integer.parseInt(up.charAt(0) + "");
        System.out.println(first);
        for (int i = 0; i < map[first].length(); i++) {
            ans.addAll(letterCombinationsHelper(map, p + map[first].charAt(i), up.substring(1)));
        }
        return ans;
    }
}
