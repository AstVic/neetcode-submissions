class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            seen.add(nums[i]);
        }
        
        int maxLen = 0;
        for (int num: seen) {
            int curLen = 1;
            int curNum = num + 1;
            if (seen.contains(num - 1)) continue;
            while (seen.contains(curNum++)) curLen++;
            maxLen = Integer.max(maxLen, curLen);
        }
        return maxLen;
    }
}