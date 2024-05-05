package p7_leetCode.n201_400.n238_ProductOfArrayExceptSelf;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4};
        productExceptSelf(nums);
    }
    public static int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] pre = new int[len];
        int[] pst = new int[len];
        pre[0] = 1;
        pst[len-1] = 1;
        for (int i = 1; i < len; i++) {
            pre[i] = pre[i-1] * nums[i-1];
        }
        for (int j = len-2; j >= 0; j--) {
            pst[j] = pst[j+1] * nums[j+1];
        }
        for (int i = 0; i < len; i++) {
            pst[i] *= pre[i];
        }
        return pst;
    }
}
