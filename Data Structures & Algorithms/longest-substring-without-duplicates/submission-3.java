class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        Map<Character, Integer> seen = new HashMap<>();
        int left = 0;
        int right = 0;
        int res = 1;
        while (right < s.length()) {
            char c = s.charAt(right);
            if (seen.containsKey(c)) {
                left = Math.max(left, seen.get(c) + 1);
            }
            seen.put(c, right);
            res = Integer.max(res, right - left + 1);
            right++;
        }
        return res;
    }
}
