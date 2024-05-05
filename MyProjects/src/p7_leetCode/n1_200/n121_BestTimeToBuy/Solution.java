package p7_leetCode.n1_200.n121_BestTimeToBuy;

class Solution {
    public static void main(String[] args) {

        int[] a = new int[] {7,1,5,3,6,4};

        System.out.println(maxProfit(a));

    }

    public static int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;

        for (int price : prices) {
            if (price <= min) min = price;

            profit = Math.max (profit, (price - min));
        }

        return profit;
    }
}
