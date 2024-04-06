package prjcts.p8_grind75;

import java.util.Arrays;
import java.util.HashMap;

public class N242_ValidAnagra {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        char[] sa = s.toCharArray();
        char[] ta = t.toCharArray();
        Arrays.sort(sa);
        Arrays.sort(ta);
        return Arrays.equals(sa, ta);
    }

    public static HashMap<Character, Integer> mapIt (String st) {
        HashMap<Character, Integer> m = new HashMap<>();
        for (char c : st.toCharArray()) {
            Integer i = m.get(c);
            m.put(c, 1 + (i != null ? i : 0));
        }
        return m;
    }
}
