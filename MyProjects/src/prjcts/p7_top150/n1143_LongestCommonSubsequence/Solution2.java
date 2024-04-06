package prjcts.p7_top150.n1143_LongestCommonSubsequence;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Solution2 {
    public static void main(String[] args) {
        String t1 = "mhunuzqrkzsnidwbun";
        String t2 = "szulspmhwpazoxijwbq";
        System.out.println(longestCommonSubsequence(t1, t2));
    }

    public static int longestCommonSubsequence(String text1, String text2) {
        String l = text1.length() < text2.length() ? text2 : text1;
        String s = text1.length() >= text2.length() ? text2 : text1;
        findNodes(s, l);
        return 0;
    }

    public static StringBuilder findNodes( String s, String l) {
        StringBuilder seq = new StringBuilder();
        int last = 0;
        for (int i = 0; i < s.length(); i++) {
            int temp = l.indexOf(s.charAt(i), last);
            if (temp != -1) {
                if (temp >= last) {
                    seq.append(s.charAt(i));
                    if (temp == l.length()-1) {
                        StringBuilder c1 = findNodes(s.substring(i+1), l);
                        if (!c1.isEmpty()) seq.deleteCharAt(seq.length()-1).append(c1);
                    }
                    last = ++temp;
                }
            }
        }
        System.out.println(seq);
        return seq;
    }
}
