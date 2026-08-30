class Solution {
    public int evalRPN(String[] tokens) {
        List<String> operators = List.of("+", "-", "*", "/");
        Deque<Integer> nums = new ArrayDeque<>();
        int i = 0;

        while (i < tokens.length) {
            String s = tokens[i];
            if (operators.contains(s)) {
                int n2 = nums.pop();
                int n1 = nums.pop();
                if (s.equals("+")) {
                    nums.push(n1 + n2);
                } else if (s.equals("-")) {
                    nums.push(n1 - n2);
                } else if (s.equals("*")) {
                    nums.push(n1 * n2);
                } else {
                    nums.push(n1 / n2);
                }
            } else {
                nums.push(Integer.parseInt(s));
            }
            i++;
        }
        return nums.pop();
    }
}
