package p7_leetCode.n1_200.n22_GenerateParentheses;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> generateParenthesis(int n) {
    List<String> result = new ArrayList<>();
    generate(result, "", 0, 0, n);
    return result;
    }

    public void generate (List<String> result, String str, int open, int close, int n){
        if (str.length() == 2 * n) {
            result.add(str);
        }

        if (open < n) {
            generate(result, str + "(", open + 1, close, n);
        }

        if (close < open) {
            generate(result, str + ")", open, close + 1, n);
        }
    }
}
