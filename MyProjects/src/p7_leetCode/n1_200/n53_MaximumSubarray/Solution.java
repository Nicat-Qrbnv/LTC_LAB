package p7_leetCode.n1_200.n53_MaximumSubarray;


class Solution {
    public static void main(String[] args) {
        int[] array = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(array));
    }

    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        int curMax = nums[0];
        for (int i = 1; i< nums.length; i++) {
            int num = nums[i];
            curMax = Math.max(num, curMax + num);
            max = Math.max(max, curMax);
        }
        return max;
    }
}
