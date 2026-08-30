class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            int target = -1 * nums[i];
            int l = i+1; int r = nums.length - 1;

            while (l < r) {
                if (nums[l] + nums[r] == target){
                    List<Integer> cur = 
                        new ArrayList<>(Arrays.asList(nums[i], nums[l], nums[r]));
                    cur.sort(Comparator.naturalOrder());
                    if (!res.contains(cur)) res.add(cur);
                    l++; r--;
                } else if (nums[l] + nums[r] > target) r--;
                else l++;
            }
        }
        return res;
    }
}
