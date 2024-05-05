package p7_leetCode.n1_200.n153_FindMinimumInRotatedSortedArray;

class Solution {
    public static void main(String[] args) {
        System.out.println(findMin(2, 1));
    }
    public static int findMin(int... nums) {
        if (nums.length > 1) {
            int l = 0;
            int r = nums.length - 1;
            while (l <= r) {
                int m = (l + r) >>> 1;
                if (nums[l] <= nums[r]) {
                    return nums[l];
                } else if (nums[m] > nums[r]) {
                    l = m + 1;
                } else {
                    r = m;
                }
            }
        }
        return nums[0];
    }
}