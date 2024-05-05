package p7_leetCode.n1_200.n125_ValidPalindrome;

class Solution {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
        String s2 = "0P";
        System.out.println(isPalindrome(s2));
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int f = 0;
        int l = s.length()-1;
        while (f < l) {
            boolean fc = Character.isLetterOrDigit(s.charAt(f));
            boolean lc = Character.isLetterOrDigit(s.charAt(l));
            if (!fc) {
                f++;
            } else if (!lc) {
                l--;
            } else if (s.charAt(f++) != s.charAt(l--)) {
                return false;
            }
        }
        return true;
    }
}
