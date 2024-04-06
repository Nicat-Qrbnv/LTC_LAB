package prjcts.p7_top150;

import java.util.Arrays;

public class N88_MergeSortedArray {
    public static void main(String[] args) {
        int[] m1 = new int[] {1,2,3,0,0,0};
        int[] n1 = new int[] {2,5,6};
        merge(m1, 3, n1, 3);

        int[] m2 = new int[] {0};
        int[] n2 = new int[] {1};
        merge(m2, 0, n2, 1);

        int[] m3 = new int[] {4,5,6,0,0,0};
        int[] n3 = new int[] {1,2,3};
        merge(m3, 3, n3, 3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int l = m - 1;
        int r = n - 1;
        int k = m + n - 1;

        while (r >= 0) {
            if (l >= 0 && nums1[l] > nums2[r]) {
                nums1[k--] = nums1[l--];
            } else {
                nums1[k--] = nums2[r--];
            }
        }
        System.out.println(Arrays.toString(nums1));
    }
}
