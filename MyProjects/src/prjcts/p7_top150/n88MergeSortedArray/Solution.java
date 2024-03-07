package prjcts.p7_top150.n88MergeSortedArray;

import java.util.Arrays;

public class Solution {
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
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        System.out.println(Arrays.toString(nums1));
    }
}
