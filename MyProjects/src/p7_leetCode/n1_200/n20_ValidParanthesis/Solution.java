package p7_leetCode.n1_200.n20_ValidParanthesis;

import java.util.Stack;

class Solution {
    public static void main(String[] args) {
        String[] ss = new String[]{
                "{}[]()", "{[(])]}",
                "()", "(]", ")", "))"
        };

        for (String s : ss) {
            System.out.println(isValid(s));
        }
    }

    public static boolean isValid(String s) {
        int len = s.length();
        if (len % 2 != 0) return false;
        Stack<Character> ps = new Stack<>();
        for (char p : s.toCharArray()) {
            if (p == '(') {
                ps.push(')');
            } else if (p == '[') {
                ps.push(']');
            } else if (p == '{') {
                ps.push('}');
            } else if (ps.empty() || ps.pop() != p) {
                return false;
            }
        }
        return ps.empty();
    }
}
