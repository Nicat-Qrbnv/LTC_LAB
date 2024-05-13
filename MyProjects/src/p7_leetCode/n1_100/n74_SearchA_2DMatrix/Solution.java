package p7_leetCode.n1_100.n74_SearchA_2DMatrix;

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int a = matrix.length;
        int b = matrix[0].length;
        int lft = 0, rgt = a * b - 1;

        while (lft <= rgt) {
            int mid = (lft + rgt)>>>1;
            int midVal = matrix[mid / b][mid % b];

            if (midVal == target) {
                return true;
            } else if (midVal < target) {
                lft = mid + 1;
            } else {
                rgt = mid - 1;
            }
        }
        return false;
    }
}