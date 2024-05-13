package p7_leetCode.n101_200.n134_GasStation;

class Solution {
    public static void main(String[] args) {
        int[] gas = new int[] {1,2,3,4,5}, cost = new int[] {3,4,5,1,2};
        System.out.println(canCompleteCircuit(gas, cost));

        int[] gas1 = new int[] {5,1,2,3,4}, cost1 = new int[] {4,4,1,5,1};
        System.out.println(canCompleteCircuit(gas1, cost1));

        int[] gas2 = new int[] {6,1,4,3,5}, cost2 = new int[] {3,8,2,4,2};
        System.out.println(canCompleteCircuit(gas2, cost2));
    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0;
        int sum = 0;
        int index = 0;
        boolean found = false;
        for (int i = 0; i < gas.length; i++) {

            int dif = (gas[i] - cost[i]);

            if (found && (sum + dif < 0)) {
                found = false;
            }

            sum += dif;
            total += dif;

            if (dif >= 0 && !found) {
                index = i;
                found = true;
            }

        }

        return (total < 0) ? -1 : index;
    }
}
