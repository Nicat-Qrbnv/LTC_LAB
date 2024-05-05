package p7_leetCode.n201_400.n232_ImplementQueueUsingStack;

import java.util.Stack;

class MyQueue {
    public Stack<Integer> main;

    public MyQueue() {
        main = new Stack<>();
    }

    public void push(int x) {
        main.push(x);
    }

    public int pop() {
        Stack<Integer> moved = move(main);
        Integer i = moved.pop();
        main = move(moved);
        return i;
    }

    public int peek() {
        Stack<Integer> moved = move(main);
        Integer i = moved.peek();
        main = move(moved);
        return i;
    }

    private Stack<Integer> move(Stack<Integer> f) {
        Stack<Integer> e = new Stack<>();
        while (!f.empty()) {
            e.push(f.pop());
        }
        return e;
    }

    public boolean empty() {
        return main.empty();
    }
}
