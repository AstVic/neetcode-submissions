class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        add(target, 0, 0, new ArrayList<>(), candidates);
        return res;
    }

    public void add(int target, int sum, int start, List<Integer> cur, int[] nums) {
        if (sum == target) {
            res.add(new ArrayList<>(cur));
            return;
        }
        if (sum > target) return;

        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) continue;
            cur.add(nums[i]);
            add(target, sum + nums[i], i + 1, cur, nums);
            cur.removeLast();
        }

    }
}
