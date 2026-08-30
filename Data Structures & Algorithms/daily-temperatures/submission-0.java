class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;

        Deque<Integer> stack = new ArrayDeque<>();
        int[] res = new int[n];

        int i = 1; 

        stack.push(0);
        
        while (i < n) {
            int cur = temperatures[i];

            if (cur > temperatures[stack.peek()]) {
                while (stack.size() != 0 && cur > temperatures[stack.peek()]) {
                    int head = stack.pop();
                    res[head] = i - head;
                }
            }
            stack.push(i);
            i++;
        }

        return res;
    }
}
