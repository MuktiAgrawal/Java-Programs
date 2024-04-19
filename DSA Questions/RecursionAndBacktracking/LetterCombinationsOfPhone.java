public class LetterCombinationsOfPhone {
    // Using array to store representations of each number and string builder
    // instead of hashmap and string gives better time complexity
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<String>();
        String nums[] = { "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        if (digits.length() == 0) {
            return res;
        }
        helper(digits, nums, res, new StringBuilder(), 0);
        return res;
    }

    public void helper(String digits, String nums[], List<String> res, StringBuilder sb, int ind) {
        if (ind == digits.length()) {
            res.add(sb.toString());
            return;
        }
        int digit = digits.charAt(ind) - '0';
        for (int i = 0; i < nums[digit - 1].length(); i++) {
            sb.append(nums[digit - 1].charAt(i));
            helper(digits, nums, res, sb, ind + 1);
            sb.deleteCharAt(sb.length() - 1);
        }
        return;
    }
}
