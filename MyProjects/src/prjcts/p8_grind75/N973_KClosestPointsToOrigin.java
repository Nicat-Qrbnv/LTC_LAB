package prjcts.p8_grind75;

import java.util.*;

public class N973_KClosestPointsToOrigin {
    public static void main(String[] args) {
        int[][] points = {{3, 3}, {5, -1}, {-2, 4}};
        System.out.println(Arrays.deepToString(kClosest(points, 2)));
    }

    public static int[][] kClosest(int[][] points, int k) {
        Arrays.sort(points, (p1, p2) -> p1[0] * p1[0] + p1[1] * p1[1] - p2[0] * p2[0] - p2[1] * p2[1]);
        return Arrays.copyOf(points, k);
    }
}