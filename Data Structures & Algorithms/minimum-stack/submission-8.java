class MinStack {

    Stack<Integer> s = new Stack<>();
    Stack<Integer> minS = new Stack<>();

    public MinStack() {
        
    }
    
    public void push(int val) {
        s.push(val);
        if(minS.isEmpty()) {
            minS.push(val);
        } else {
            minS.push(Math.min(val, minS.peek()));
        }
    }
    
    public void pop() {
        s.pop();
        minS.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return minS.peek();
    }
}
