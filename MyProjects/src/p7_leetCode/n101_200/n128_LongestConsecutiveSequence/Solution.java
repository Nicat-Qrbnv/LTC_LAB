package p7_leetCode.n101_200.n128_LongestConsecutiveSequence;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(longestConsecutive(0, 3, 7, 2, 5, 8, 4, 6, 0, 1));
    }

    public static int longestConsecutive(int... nums) {
        if (nums.length > 0) {
            int max = 1;
            int count = 1;
            Arrays.sort(nums);
            for (int i = 1; i < nums.length; i++) {
                int dif = nums[i] - nums[i - 1];
                if (dif == 1) {
                    count++;
                    max = Math.max(max, count);
                } else if (dif != 0) {
                    count = 1;
                }
            }
            return max;
        } else {
            return 0;
        }
    }
}
