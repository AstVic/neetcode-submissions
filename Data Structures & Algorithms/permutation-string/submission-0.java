class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int left = 0;
        int[] f1 = new int[26];
        int[] f2 = new int[26];

        for (int right = 0; right < s1.length(); right++) {
            f1[s1.charAt(right) - 'a']++;
            f2[s2.charAt(right) - 'a']++;
        }

        if (Arrays.equals(f1, f2)) return true;

        for (int right = s1.length(); right < s2.length(); right++) {
            f2[s2.charAt(left) - 'a']--;
            left++;
            f2[s2.charAt(right) - 'a']++;

           if (Arrays.equals(f1, f2)) return true;
        }

        return false;

    }
}
