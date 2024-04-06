package prjcts.p8_grind75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N57_InsertInterval {
    public static void main(String[] args) {
        int[][] intervals = new int[][]{{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
        int[] newInterval = new int[]{4, 8};
        System.out.println(Arrays.deepToString(insert(intervals, newInterval)));

        int[][] intervals2 = new int[][]{{}};
        int[] newInterval2 = new int[]{6, 8};
        System.out.println(Arrays.deepToString(insert(intervals2, newInterval2)));
    }

    public static int[][] insert(int[][] intervals, int[] newInterval) {
//        if (intervals.length == 0) {
//            return new int[][]{newInterval};
//        }
        int f = 0;
        int l = intervals.length - 1;
        ArrayList<int[]> result = new ArrayList<>();
        while (f <= l && intervals[f][1] < newInterval[0]) {
            result.add(intervals[f++]);
        }
        while (f <= l && intervals[f][0] <= newInterval[1]) {
            newInterval[0] = Math.min(intervals[f][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[f++][1], newInterval[1]);
        }
        result.add(newInterval);
        while (f <= l) {
            result.add(intervals[f++]);
        }

        return result.toArray(new int[result.size()][]);
    }
}