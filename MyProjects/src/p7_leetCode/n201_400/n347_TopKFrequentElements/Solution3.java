package p7_leetCode.n201_400.n347_TopKFrequentElements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution3 {
    public static void main(String[] args) {

    }

    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer i : nums) {
            map.put(i, map.getOrDefault(i, 0) +1);
        }

        List<Integer>[] bucket = new List[nums.length+1];
        for (int n : map.keySet()) {
            int freq = map.get(n);
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(n);
        }

        int idx = 0;
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = bucket.length-1; i >=0 && k > 0; i--) {
            List<Integer> list = bucket[i];
            if (list != null) {
                res.addAll(list);
                k-=list.size();
            }
        }
        return null;
    }
}
