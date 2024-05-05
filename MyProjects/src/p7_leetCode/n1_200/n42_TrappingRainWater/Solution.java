package p7_leetCode.n1_200.n42_TrappingRainWater;

public class Solution {

    public int trap(int[] height) {
        int l = 0;
        int r = height.length-1;
        int lm = height[l];
        int rm = height[r];
        int v = 0;

        while (l < r) {
            if (lm < rm) {
                l++;
                int lh = height[l];
                if (lm < lh) {
                    lm = lh;
                } else {
                    v += lm - lh;
                }
            } else {
                r--;
                int rh = height[r];
                if (rm < rh) {
                    rm = rh;
                } else {
                    v += rm - rh;
                }
            }
        }
        return v;
    }
}
