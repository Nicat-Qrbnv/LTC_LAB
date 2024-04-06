package prjcts.p8_grind75;

import java.util.Arrays;

public class N704_BinarySearch {
    public static void main(String[] args) {
        int i = 0b0000_0000_0000_1010;
        System.out.println(i);
        System.out.println(i>>>1);
    }

    public int search(int[] nums, int target) {
        int l = 0;
        int h = nums.length-1;
        while (l <= h) {
            int mid = (l+h)>>>1;
            int v = nums[mid];
            if (v < target) {
                l = ++mid;
            } else if (v > target) {
                h = --mid;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public int search1(int[] nums, int target) {
        int i = Arrays.binarySearch(nums, target);
        return Math.max(i, -1);
    }
}
