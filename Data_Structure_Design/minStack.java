
import java.util.Stack;

class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        this.stack = new Stack<>();
        this.minStack = new Stack<>();

    }
    
    public void push(int val) {
        stack.push(val);
        if(!minStack.isEmpty()){
            minStack.push(Math.min(val, minStack.peek()));
        } else {
            minStack.push(val);
        }
        

    }
    
    public void pop() {
        stack.pop();
        minStack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
