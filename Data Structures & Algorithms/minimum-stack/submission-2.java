class MinStack {

    Deque<Integer> nums;
    Deque<Integer> mins;

    public MinStack() {
        nums = new ArrayDeque<>();
        mins = new ArrayDeque<>();
    }

    
    public void push(int val) {
        nums.push(val);
        if (mins.isEmpty()) {
            mins.push(val);
        } else {
            mins.push(Math.min(val, mins.peek()));
        }
    }
    
    public void pop() {
        nums.pop();
        mins.pop();
    }
    
    public int top() {
        return nums.peek();
    }
    
    public int getMin() {
        return mins.peek();
    }
}
