class Solution {
    //2 3 4 5
    //1 2 6 24 - left
    //60 20 5 1 - right
    //60 40 30 24

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] res = new int[n];

        left[0] = 1;
        right[n - 1] = 1;

        for (int i = 1; i < n; i++) {
            left[i] = nums[i-1] * left[i-1];
        }
        for (int i = n - 2; i >= 0; i--) {
            right[i] = nums[i+1] * right[i+1]; 
        }
        for (int i = 0; i < n; i++) {
            res[i] = left[i] * right[i];
        }
        return res;
    }
}  
