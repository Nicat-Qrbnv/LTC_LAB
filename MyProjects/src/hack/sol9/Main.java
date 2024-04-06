package hack.sol9;

import java.util.Arrays;
import java.util.List;

public class Main {
    static int f(int idx, int prev_idx, int n, List<Integer> a, int[][] dp) {
        if (idx == n) return 0;

        if (dp[idx][prev_idx + 1] != -1) {
            return dp[idx][prev_idx + 1];
        }

        int notTake = f(idx + 1, prev_idx, n, a, dp);
        int take = Integer.MIN_VALUE;
        if (prev_idx == -1 || a.get(idx) > a.get(prev_idx)) {
            take = 1 + f(idx + 1, idx, n, a, dp);
        }

        return dp[idx][prev_idx + 1] = Math.max(take, notTake);
    }

    static int longestIncreasingSubsequence(List<Integer> arr) {
        int n = arr.size();
        int[][] dp = new int[n + 1][n + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return f(0, -1, n, arr, dp);
    }

    public static void main(String[] args) {
        List<Integer> aa = Arrays.asList(3, 10, 2, 1, 20);
        System.out.println("Length of lis is " + longestIncreasingSubsequence(aa));
    }
}

