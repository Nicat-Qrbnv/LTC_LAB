package p7_leetCode.n401_1500.n739_DailyTemperatures;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int hottest = 0;
        int[] answer = new int[n];
        for(int i = n-1; i >= 0; i--){
            int currentTemp = temperatures[i];
            if(currentTemp >= hottest){
                hottest = currentTemp;
                continue;
            }
            int days = 1;
            while(temperatures[i + days] <= currentTemp) {
                days = days + answer[i + days];
            }

            answer[i] = days;
        }

        return answer;
    }
}
