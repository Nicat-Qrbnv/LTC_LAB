package p7_leetCode.n201_400.n217_ContainsDuplicate;

import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {

    }

    public boolean containsDuplicate(int[] nums) {
        if (nums.length == 1) return false;
        System.gc();
        HashSet<Integer> hs = new HashSet<>();
        for (int n : nums) {
            if (!hs.add(n)) return true;
        }
        return false;
    }
}