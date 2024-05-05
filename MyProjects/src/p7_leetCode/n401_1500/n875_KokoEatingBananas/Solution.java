package p7_leetCode.n401_1500.n875_KokoEatingBananas;

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int len = piles.length;
        long total = 0;
        for(int p : piles){
            total += p;
        }
        int left = (int) ((total - 1) / h) + 1;
        int right = (int) ((total - len) / (h - len + 1)) + 1;
        while(left < right){
            int mid = (left + right)>>>1;
            int time = 0;
            for (int p : piles) {
                time += (p - 1) / mid + 1;
            }
            if (time > h) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}