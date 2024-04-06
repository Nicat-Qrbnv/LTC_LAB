package prjcts.p7_top150;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class N392_IsSubsequence {

    public static void main(String[] args) {
        String t1 = "bsbininm";
        String t2 = "jmjkbkjkv";
        System.out.println(isSubsequence(t1, t2));
    }

    public static boolean isSubsequence(String s, String t) {
        boolean k = true;
        int x = 0;
        for (int i = 0; i < s.length(); i++) {
            x = t.indexOf(s.charAt(i), x);
            if (x++ == -1) {
                k = false;
            }
        }
        return k;
    }
}
