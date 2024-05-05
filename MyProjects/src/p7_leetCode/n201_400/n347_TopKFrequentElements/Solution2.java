package p7_leetCode.n201_400.n347_TopKFrequentElements;

import java.util.*;

public class Solution2 {
    public static void main(String[] args) {
        int[] nums = new int[] {1, 1, 2, 3, 1, 2, 3, 3, 4, 5, 4};
        System.out.println(Arrays.toString(topKFrequent(nums, 2)));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) +1);
        }

        LinkedList<Integer>[] bucket = new LinkedList[nums.length+1];
        for (int n : map.keySet()) {
            int freq = map.get(n);
            if (bucket[freq] == null) {
                bucket[freq] = new LinkedList<>();
            }
            bucket[freq].add(n);
        }

        LinkedList<Integer> res = new LinkedList<>();
        for (int f = bucket.length-1; f > 0 && k > 0; f--) {
            if (bucket[f] != null) {
                List<Integer> ns = bucket[f];
                res.addAll(ns);
                k -= ns.size();
            }
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}