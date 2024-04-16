public class SubsetsI {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> small = new ArrayList<>();
        return helper(nums, small, 0);
    }

    public List<List<Integer>> helper(int[] nums, List<Integer> small, int i) {
        if (i == nums.length) {
            List<List<Integer>> res = new ArrayList<>();
            res.add(new ArrayList<>(small));
            return res;
        }
        List<List<Integer>> res = new ArrayList<>();
        res.addAll(helper(nums, small, i + 1));
        small.add(nums[i]);
        res.addAll(helper(nums, small, i + 1));
        small.remove(small.size() - 1);
        return res;
    }

    public List<List<Integer>> subsets2(int[] nums) {
        List<Integer> small = new ArrayList<>();
        return helper(nums, small, 0);
    }

    public List<List<Integer>> helper2(int[] nums, List<Integer> small, int i) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>(small));
        for (int j = i; j < nums.length; j++) {
            small.add(nums[j]);
            res.addAll(helper(nums, small, j + 1));
            small.remove(small.size() - 1);
        }
        return res;
    }

    public List<List<Integer>> subsets3(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> small = new ArrayList<>();
        return helper(nums, result, small, 0);
    }

    public List<List<Integer>> helper3(int nums[], List<List<Integer>> result, List<Integer> small, int index) {
        result.add(new ArrayList<>(small));
        for (int i = index; i < nums.length; i++) {
            small.add(nums[i]);
            helper(nums, result, small, i + 1);
            small.remove(small.size() - 1);
        }
        return result;
    }

    public List<List<Integer>> subsets4(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        for (int j : nums) {
            int n = res.size();
            for (int i = 0; i < n; i++) {
                List<Integer> small = new ArrayList<>(res.get(i));
                small.add(j);
                res.add(small);
            }
        }
        return res;
    }
}
