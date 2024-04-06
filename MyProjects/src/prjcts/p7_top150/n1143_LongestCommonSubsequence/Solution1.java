package prjcts.p7_top150.n1143_LongestCommonSubsequence;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

public class Solution1 {
    public static void main(String[] args) {
        String t1 = "papmretkborsrurgtina";
        String t2 = "nsnupotstmnkfcfavaxgl";
        System.out.println(longestCommonSubsequence(t1, t2));
    }
    public static int longestCommonSubsequence(String text1, String text2) {
        String l = text1.length() < text2.length() ? text2 : text1;
        String s = text1.length() >= text2.length() ? text2 : text1;
        Iterator<StringBuilder> it = getSubsequences(s, l).iterator();
        int m = 0;
        while (it.hasNext()) {
            m = Math.max(m, isSubsequence(it.next(), l));
        }
        return m;
    }

    public static Queue<StringBuilder> getSubsequences(String s, String l) {
        ArrayDeque<StringBuilder> q = new ArrayDeque<>();
        int x = -1;
        for (int i = 0; i < s.length(); i++) {
            int t = l.indexOf(s.charAt(i));
            if (t> -1 && t < x || t != -1 && x == -1) {
                x = t;
                q.offerLast(findNodes(s.substring(i), l));
            }
        }
        System.out.println(q);
        return q;
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

    public static int isSubsequence(StringBuilder s, String t) {
        int m = 0;
        int x = 0;
        for (int i = 0; i < s.length() && x < t.length(); i++) {
            int r = t.indexOf(s.charAt(i), x);
            if (r >= x) {
                x = ++r;
                m++;
            }
        }
        return m;
    }

}