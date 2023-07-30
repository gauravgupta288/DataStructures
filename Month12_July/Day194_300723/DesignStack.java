package Month12_July.Day194_300723;

import java.util.Stack;

public class DesignStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;
    int min = Integer.MAX_VALUE;

    public DesignStack() {
        stack = new Stack<Integer>();
        minStack = new Stack<Integer>();

    }

    public void push(int val) {
        stack.push(val);

        min = Math.min(val, minStack.isEmpty() ?val :minStack.peek());
        minStack.push(min);
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

class x{
    public static void main(String s[]){
        DesignStack minStack = new DesignStack();

        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.getMin(); // return -3
        minStack.pop();
        minStack.top();    // return 0
        minStack.getMin();
    }
}
