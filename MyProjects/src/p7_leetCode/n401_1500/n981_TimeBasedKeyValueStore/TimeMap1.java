package p7_leetCode.n401_1500.n981_TimeBasedKeyValueStore;

import java.util.*;

class TimeMap1 {
    record TimeNode (int timeStamp, String value) {}
    HashMap<String, ArrayList<TimeNode>> map = new HashMap<>();
    
    public void set(String key, String value, int timestamp) {
        ArrayList<TimeNode> list = map.get(key);
        TimeNode tn = new TimeNode(timestamp, value);
        if (list == null) {
            list = new ArrayList<>(List.of(tn));
            map.put(key, list);
        } else {
            list.add(tn);
        }
    }
    
    public String get(String key, int timestamp) {
        String res = "";
        if (map.containsKey(key)) {
            ArrayList<TimeNode> list = map.get(key);
            int l = 0, r = list.size() - 1;

            while (l <= r) {
                int m = (l + r) >>> 1;
                int mid = list.get(m).timeStamp;
                if (mid == timestamp) {
                    return list.get(m).value;
                } else if (mid < timestamp) {
                    res = list.get(l).value;
                    l = m + 1;
                } else {
                    r = m - 1;
                }
            }
        }
        return res;
    }
}