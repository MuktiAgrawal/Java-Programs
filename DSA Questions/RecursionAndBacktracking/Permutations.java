public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> small = new ArrayList<Integer>();
        helper(nums, result, small);
        return result;
    }

    public void helper(int nums[], List<List<Integer>> result, List<Integer> small) {
        if (small.size() == nums.length) {
            result.add(new ArrayList<Integer>(small));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!small.contains(nums[i])) {
                small.add(nums[i]);
                helper(nums, result, small);
                small.remove(small.size() - 1);
            }
        }
        return;
    }

    // Optimal T(n*n!)
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(ans, nums, 0);
        return ans;
    }

    public void helper(List<List<Integer>> res, int[] nums, int index) {
        List<Integer> small = new ArrayList<>();
        if (index == nums.length) {
            for (int i = 0; i < nums.length; i++) {
                small.add(nums[i]);
            }
            res.add(new ArrayList<>(small));
            return;
        }
        for (int i = index; i < nums.length; i++) {
            swap(index, i, nums);
            helper(res, nums, index + 1);
            swap(index, i, nums);
        }
    }

    void swap(int i, int j, int nums[]) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
