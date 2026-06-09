class MinStack {

    Stack<Integer> minStack;

    public MinStack() {
        minStack = new Stack<Integer>();
    }
    
    public void push(int val) {
        minStack.push(val);
    }
    
    public void pop() {
        if(!minStack.empty()){
            minStack.pop();
        }
    }
    
    public int top() {
        if(!minStack.empty()){
            return minStack.peek();
        }
        return -1;
    }
    
    public int getMin() {
        if(!minStack.empty()){
            return Collections.min(minStack);
        }
        return -1;
    }
}
