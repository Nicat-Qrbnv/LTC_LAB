package prjcts.p7_top150;

public class N11_ContainerWithMostWater {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[] {1,8,6,2,5,4,8,3,7}));
    }

    public static int maxArea(int[] height) {
        int f = 0;
        int l = height.length-1;
        int v = 0;

        while (f != l) {
            int temp = (l-f);
            if (height[f] >= height[l]) {
                temp *= height[l--];
            } else {
                temp *= height[f++];
            }
            if (temp > v) v = temp;
        }
        return v;
    }
}
