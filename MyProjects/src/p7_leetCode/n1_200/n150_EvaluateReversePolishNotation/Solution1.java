package p7_leetCode.n1_200.n150_EvaluateReversePolishNotation;

import java.util.Stack;

public class Solution1 {
//    public static void main(String[] args) {
//        Solution1 sol = new Solution1();
//        System.out.println(sol.evalRPN("4","13","5","/","+"));
//    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        for (String t : tokens) {
            switch (t) {
                case "+" -> s.push(sum(s));
                case "-" -> s.push(ext(s));
                case "*" -> s.push(mlt(s));
                case "/" -> s.push(div(s));
                default -> s.push(Integer.parseInt(t));
            }
        }
        return s.pop();
    }

    int sum(Stack<Integer> q) {
        int a = q.pop();
        int b = q.pop();
        return b+a;
    }

    int ext(Stack<Integer> q) {
        int a = q.pop();
        int b = q.pop();
        return b-a;
    }

    int mlt(Stack<Integer> q) {
        int a = q.pop();
        int b = q.pop();
        return b*a;
    }

    int div(Stack<Integer> q) {
        int a = q.pop();
        int b = q.pop();
        return b/a;
    }
}
