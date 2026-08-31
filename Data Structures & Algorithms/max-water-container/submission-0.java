class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int l = 0; int r = n - 1;
        int maxSquare = Integer.min(heights[l], heights[r]) * (r - l);

        while (l < r) {
            if (heights[l] < heights[r]) l++;
            else r--;
            int cur = 
            maxSquare = Integer.max(
                maxSquare, Integer.min(heights[l], heights[r]) * (r - l));
        }

        return maxSquare;
    }
}
