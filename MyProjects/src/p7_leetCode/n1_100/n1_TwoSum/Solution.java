package p7_leetCode.n1_100.n1_TwoSum;

import java.util.*;

class Solution {
    public static void main(String[] args) {
        int[] nums = new int[] {2,7,11,15}; int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));

        int[] nums2 = new int[] {3, 3}; int target2 = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int c = 0;
        while (c < nums.length) {
            for (int i = c + 1; i < nums.length; i++) {
                if (nums[c] + nums[i] == target) {
                    return new int[]{c, i};
                }
            }
            c++;
        }
        return null;
    }

    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> nm = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int c = target - nums[i];
            if (nm.containsKey(c)) {
                return new int[]{nm.get(c), i};
            }
            nm.put(nums[i], i);
        }

        return null;
    }
}
