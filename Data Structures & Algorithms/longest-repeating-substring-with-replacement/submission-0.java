class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int maxFreq = 0;
        int maxLen = 1;
        int[] freq = new int[26];

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            freq[c - 'A']++;
            maxFreq = Integer.max(maxFreq, freq[c - 'A']);

            int curLen = right - left + 1;

            if (curLen - maxFreq > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            maxLen = Integer.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
