class Solution {
    public int getTime(int[] piles, int k) {
        int res = 0;
        for (int pile: piles) {
            res += (pile + k - 1) / k;
        }
        return res;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;

        for (int pile: piles) {
            max = Integer.max(max, pile);
        }

        int left = 1;
        int right = max;
        int answer = max;

        while (left <= right) {
            int mid = (left + right) / 2;
            int hours = getTime(piles, mid);
        
            if (hours <= h) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return answer;
    }
}
