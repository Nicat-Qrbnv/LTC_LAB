package p7_leetCode.n1_100.n15_3Sum;

import java.util.*;

class Solution {
    public static List<List<Integer>> threeSum(int[] nums){
        Set<List<Integer>> set = new HashSet<>();
        if(nums.length == 0)
            return new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++) {
            int j=i+1;
            int k=nums.length-1;
            while(j<k) {
                int sum= nums[i]+nums[j]+nums[k];
                if(sum==0) {
                    set.add(List.of(nums[i], nums[j++], nums[k--]));
                } else if(sum<0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return new ArrayList<>(set);
    }

    public List<List<Integer>> threeSum2(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i=0; i<nums.length-2; i++) {
            int target = -nums[i];
            int start = i+1;
            int end = nums.length - 1;
            while (start < end) {
                int curSum = nums[start] + nums[end];
                if (curSum == target) {
                    result.add(Arrays.asList(nums[i], nums[start++], nums[end--]));
                    while(start < end && nums[start] == nums[start-1]) start++;
                    while(start < end && nums[end] == nums[end+1]) end--;
                } else {
                    if (curSum > target) end--;
                    else start++;
                }
            }
            while(i < nums.length - 2 && nums[i] == nums[i+1]) i++;
        }
        return result;
    }
}
