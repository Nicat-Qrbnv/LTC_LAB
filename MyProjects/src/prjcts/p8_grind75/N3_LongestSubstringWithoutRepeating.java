package prjcts.p8_grind75;

public class N3_LongestSubstringWithoutRepeating {
    public static void main(String[] args) {
        String s = "abcabckc";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        StringBuilder b = new StringBuilder();
        int m = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int x = b.indexOf("" + c);
            b.append(c);
            if (x == - 1) {
                m = Math.max(m, b.length());
            } else {
                b.delete(0, x+1);
            }
        }
        return m;
    }
}
