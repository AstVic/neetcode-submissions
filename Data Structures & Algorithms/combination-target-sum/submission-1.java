class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        add(target, 0, 0, new ArrayList<>(), nums);
        return res;
    }

    public void add(int target, int sum, int start, List<Integer> cur, int[] nums) {
        if (sum == target) {
            res.add(new ArrayList<>(cur));
            return;
        }
        if (sum > target) return;

        for (int i = start; i < nums.length; i++) {
            cur.add(nums[i]);
            add(target, sum + nums[i], i, cur, nums);
            cur.removeLast();
        }
    }
}