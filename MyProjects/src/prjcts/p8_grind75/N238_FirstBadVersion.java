package prjcts.p8_grind75;

public class N238_FirstBadVersion {
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
