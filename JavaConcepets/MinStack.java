package JavaConcepets;

import java.util.Stack;

class MinStack {

    boolean ans [ ] = new boolean[10];
    Stack<Integer> stack;
    Stack<Integer> minStack;
    int min = Integer.MAX_VALUE;

    public MinStack() {
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

    public static void main(String[] args) {
        MinStack ms = new MinStack();
        ms.push(-2);
        ms.push(0);
        ms.push(-3);

        System.out.println(ms.getMin());
        ms.pop();
        System.out.println(ms.top());
        System.out.println(ms.getMin());
        ms.pop();
        System.out.println(ms.getMin());
    }
}
