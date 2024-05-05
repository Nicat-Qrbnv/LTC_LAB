package p7_leetCode.n201_400.n347_TopKFrequentElements;

import java.util.*;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        int[] nums = new int[] {1, 1, 2, 3, 1, 2, 3, 3, 4, 5, 4};
        System.out.println(Arrays.toString(topKFrequent(nums, 2)));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        List<Integer> list = map.entrySet().stream().sorted((e1, e2) -> e2.getValue() - e1.getValue()).map(Map.Entry::getKey).toList();
        return Arrays.copyOf(list.stream().mapToInt(Integer::intValue).toArray(), k);
    }
}
