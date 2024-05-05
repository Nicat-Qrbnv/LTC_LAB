package p7_leetCode.n1_200.n33_SearchInRotatedSortedArray;

class Solution {
    public static void main(String[] args) {
        System.out.println(search(1, 2, 3, 4, 5, 1));
    }

    public static int search(int target, int... nums) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int m = (l + r) >>> 1;
            int mid = nums[m];
            if (mid == target) {
                return m;
            } else if (mid <= nums[r]) {
                if (target >= mid && target <= nums[r]) {
                    l = m + 1;
                } else {
                    r = m - 1;
                }
            } else {
                if (target <= mid && target >= nums[l]) {
                    r = m - 1;
                } else {
                    l = m + 1;
                }
            }
        }
        return -1;
    }
}
