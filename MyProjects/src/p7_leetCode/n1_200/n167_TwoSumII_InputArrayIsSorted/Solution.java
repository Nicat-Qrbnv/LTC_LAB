package p7_leetCode.n1_200.n167_TwoSumII_InputArrayIsSorted;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;
        int sum = 0;
        while (l < r) {
            sum = numbers[l] + numbers[r];
            if (sum == target) {
                break;
            } else if (sum > target) {
                r--;
            } else {
                l++;
            }
        }
        return new int[]{l+1, r+1};
    }
}
