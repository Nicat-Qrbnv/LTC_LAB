package p7_leetCode.n1_200.n56_MergeIntervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public static void main(String[] args) {
        int[][] intervals = new int[][] {{1,4},{0,2},{3,5}};
        System.out.println(Arrays.deepToString(merge(intervals)));
    }

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparing(a -> a[0]));
        ArrayList<int[]> res = new ArrayList<>();
        int first = 0;
        int next = first + 1;
        while (next < intervals.length && first < intervals.length) {
            if (intervals[first][1] < intervals[next][0]) {
                res.add(intervals[first]);
                first = next++;
            } else if (intervals[first][1] >= intervals[next][0]) {
                if (intervals[first][1] > intervals[next][1]) {
                    next++;
                } else {
                    intervals[first][0] = Math.min (intervals[first][0], intervals[next][0]);
                    intervals[first][1] = Math.max(intervals[first][1], intervals[next++][1]);
                    res.add(intervals[first]);
                    first = next++;
                }
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}
