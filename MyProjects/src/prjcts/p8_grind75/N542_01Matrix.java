package prjcts.p8_grind75;

import java.util.ArrayDeque;
import java.util.Queue;

public class N542_01Matrix {
    public static void main(String[] args) {
        int[][] mat = {{0, 0, 0}, {0, 1, 0}, {1,1,1}};
        for (int[] a : mat) {
            for (int i : a) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int[] a : updateMatrix(mat)) {
            for (int i : a) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static int[][] updateMatrix1(int[][] mat) {
        for (int i = 0; i< mat.length; i++) {
            for (int j=0; j< mat[i].length; j++) {
                if (mat[i][j] != 0) {
                    mat[i][j] = search(mat, i, j);
                }
            }
        }
        return mat;
    }

    public static int search (int[][] mat, int i, int j) {
        int u = searchUp(mat, i, j);
        int d = searchDown(mat, i, j);
        int r = searchRight(mat, i, j);
        int l = searchLeft(mat, i, j);
        return Math.min (Math.min(u, d), Math.min(r, l));
    }

    public static int searchUp (int[][] mat, int i, int j) {
        int u;
        for (u = 1; u < i; u++) {
            if (mat[i-u][j] == 0) break;
        }
        return u;
    }

    public static int searchDown (int[][] mat, int i, int j) {
        int d;
        for (d = 1; i+d < mat.length; d++) {
            if (mat[i+d][j] == 0) break;
        }
        return d;
    }

    public static int searchRight (int[][] mat, int i, int j) {
        int r;
        for (r = 1; j+r < i; r++) {
            if (mat[i][j+r] == 0) break;
        }
        return r;
    }

    public static int searchLeft (int[][] mat, int i, int j) {
        int l;
        for (l = 1; l < j; l++) {
            if (mat[i][j-l] == 0) break;
        }
        return l;
    }

    static int[] DIR = new int[]{0, 1, 0, -1, 0};
    public static int[][] updateMatrix(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        Queue<int[]> q = new ArrayDeque<>();
        for (int r = 0; r < m; ++r) {
            for (int c = 0; c < n; ++c) {
                if (mat[r][c] == 0) {
                    q.offer(new int[]{r, c});
                } else {
                    mat[r][c] = -1;
                }
            }
        }

        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int r = curr[0], c = curr[1];
            for (int i = 0; i < 4; ++i) {
                int nr = r + DIR[i], nc = c + DIR[i+1];
                if (nr < 0 || nr == m || nc < 0 || nc == n || mat[nr][nc] != -1) continue;
                mat[nr][nc] = mat[r][c] + 1;
                q.offer(new int[]{nr, nc});
            }
        }
        return mat;
    }
}
