package p7_leetCode.n401_1500.n733_FloodFill;

class Solution {
    public static void main(String[] args) {
        int[][] image = {{0, 0, 0}, {0, 0, 0}};
        for (int[] a : image) {
            for (int i : a) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int[] a : floodFill(image, 1, 0, 2)) {
            for (int i : a) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (image[sr][sc] != newColor) {
            fill(image, sr, sc, image[sr][sc], newColor);
        }
        return image;
    }

    public static void fill (int[][] image, int sr, int sc, int color, int newColor) {
        if (sr >= 0 && sr < image.length && sc >= 0 && sc < image[0].length && image[sr][sc] == color) {
            image[sr][sc] = newColor;
            fill(image, sr-1, sc, color, newColor);
            fill(image, sr, sc+1, color, newColor);
            fill(image, sr+1, sc, color, newColor);
            fill(image, sr, sc-1, color, newColor);
        }
    }
}
