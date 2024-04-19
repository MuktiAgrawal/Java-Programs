public class PalindromePartitioning {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        helper(res, new ArrayList<String>(), s, 0);
        return res;
    }

    public void helper(List<List<String>> res, List<String> small, String s, int ind) {
        if (ind == s.length()) {
            res.add(new ArrayList<>(small));
            return;
        }
        for (int i = ind + 1; i < s.length() + 1; i++) {
            if (isPalindrome(s, ind, i - 1)) {
                small.add(s.substring(ind, i));
                helper(res, small, s, i);
                small.remove(small.size() - 1);
            }
        }
    }

    public boolean isPalindrome(String s, int start, int end) {
        while (start <= end) {
            if (s.charAt(start++) != s.charAt(end--)) {
                return false;
            }
        }
        return true;
    }
}
