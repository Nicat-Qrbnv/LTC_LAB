package p7_leetCode.n1_200.n155_MinStack;

import java.util.Comparator;
import java.util.Stack;

class MinStack {
    private Stack<Integer> stack = new Stack<>();
    private Integer min;

    public void push(int val) {
        stack.push(val);
        if (stack.size() == 1) {
            min = val;
        } else {
            min = val < min ? val : min;
        }
    }

    public void pop() {
        int val = stack.pop();
        if (val == min) {
            min = stack.stream().min(Comparator.naturalOrder()).orElse(null);
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }
}