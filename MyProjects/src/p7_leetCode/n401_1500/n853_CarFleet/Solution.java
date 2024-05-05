package p7_leetCode.n401_1500.n853_CarFleet;

import java.util.Arrays;

class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int len = speed.length;
        float[] time = new float[target+1];
        for (int i = 0; i < len; i++) {
            time[position[i]] = (target - position[i]) / (float) speed[i];
        }
        float max = 0;
        int count = 0;
        for (int i=time.length-1; i >= 0; i--) {
            if (time[i] > max) {
                count++;
                max = time[i];
            }
        }
        return count;
    }
}