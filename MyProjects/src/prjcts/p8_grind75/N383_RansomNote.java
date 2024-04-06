package prjcts.p8_grind75;

public class N383_RansomNote {
    public static void main(String[] args) {
        String r = "acd";
        String m = "ajdcf";
        System.out.println(canConstruct(r, m));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] searchFrom = new int[26];

        for (char c : ransomNote.toCharArray()) {
            int index = magazine.indexOf(c, searchFrom[c - 'a']);
            if (index == -1) {
                return false;
            }
            searchFrom[c - 'a'] = index + 1;
        }

        return true;
    }
}
