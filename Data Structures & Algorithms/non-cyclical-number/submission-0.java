class Solution {
    public int getSum(int n) {
        int sum = 0;
        while (n != 0) {
            int x = n % 10;
            sum += x*x;
            n /= 10;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        int cur = n;
        while (cur != 1) {
            if (seen.contains(cur)) return false;
            seen.add(cur);
            cur = getSum(cur);
        }
        return true;
    }
}
