package p7_leetCode.n401_1500.n567_PermutationInString;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(checkInclusion1("adc", "dcda"));
    }
    public static boolean checkInclusion(String s1, String s2) {
        int[] alph = new int[26];
        for (int i = 0; i < s2.length(); i++) {
            alph[s2.charAt(i) - 'a']++;
        }
        int fst = Integer.MAX_VALUE, lst = -1;
        for (int i = 0; i < s1.length(); i++) {
            int idx = s1.charAt(i) - 'a';
            if (--alph[idx] < 0) {
                return false;
            } else {
                fst = Math.min (fst, s2.indexOf(idx + 'a'));
                lst = Math.max (lst, s2.lastIndexOf(idx + 'a'));
            }
        }
        String s2s = s2.substring(fst, lst+1);
        return s2s.length() == s1.length();
    }

    public static boolean checkInclusion1(String s1, String s2) {
        if(s1.length() > s2.length()) return false;

        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for(int i = 0; i < s1.length(); i++){
            arr1[s1.charAt(i) - 'a']++;
            arr2[s2.charAt(i) - 'a']++;
        }

        if(Arrays.equals(arr1, arr2)) return true;

        int front = 0;
        int back = s1.length();
        while(back < s2.length()){
            arr2[s2.charAt(front) - 'a']--;
            arr2[s2.charAt(back) - 'a']++;

            if(Arrays.equals(arr1, arr2)) return true;
            front++;
            back++;
        }
        return false;
    }
}
