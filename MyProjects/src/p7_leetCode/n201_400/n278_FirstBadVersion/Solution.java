package p7_leetCode.n201_400.n278_FirstBadVersion;

class Solution {
    public static void main(String[] args) {
        System.out.println(firstBadVersion(10));
    }

    public static int firstBadVersion(int n) {
        int l = 1;
        while (l <= n) {
            int mid = (l+n)>>>1;
            if (isBadVersion(mid)) {
                n = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    static boolean isBadVersion(int version) {
        return version >= 3;
    }
}
