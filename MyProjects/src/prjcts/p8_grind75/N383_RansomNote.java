package prjcts.p8_grind75;

import java.util.HashMap;

public class N383_RansomNote {
    public static void main(String[] args) {
        String r = "acdh";
        String m = "ajdcf";
        System.out.println(canConstruct2(r, m));
    }

    public static boolean canConstruct1(String ransomNote, String magazine) {
        int[] alphabet = new int[26];
        for (char c : ransomNote.toCharArray()) {

            int lastIdx = alphabet[c - 'a'];
            int idx = magazine.indexOf(c, lastIdx);
            if (idx == -1) {
                return false;
            }
            alphabet[c - 'a'] = idx + 1;
        }
        return true;
    }


    public static boolean canConstruct2(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : ransomNote.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) - 1);
            if (map.get(c) == -1) return false;
        }

        return true;
    }
}
