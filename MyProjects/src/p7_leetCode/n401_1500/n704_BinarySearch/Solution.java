package p7_leetCode.n401_1500.n704_BinarySearch;

class Solution {
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
}
