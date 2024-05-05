package p7_leetCode.n1_200.n55_JumpGame;

class Solution {
    public static void main(String[] args) {
        System.out.println(canJump(new int[] {3,2,1,0,4}));
    }

    public static boolean canJump(int[] nums) {
        boolean ok = true;
        if (nums.length > 1) {
            int lt = nums.length - 1;
            for (int i = lt-1; i >= 0; i--) {
                if (lt - i <= nums[i]) lt = i;
                if (i == 0 && lt != 0) ok = false;
            }
        }
        return ok;
    }
}
