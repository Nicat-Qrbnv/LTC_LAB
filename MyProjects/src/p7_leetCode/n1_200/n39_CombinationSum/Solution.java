package p7_leetCode.n1_200.n39_CombinationSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        int[] can = new int[]{2, 3, 4, 5};
        int tar = 8;
        System.out.println(combinationSum(can, tar));
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> allSol = new ArrayList<>();
        Arrays.sort(candidates);
        return findSol(allSol, new ArrayList<>(), candidates, target, 0);
    }

    public static List<List<Integer>> findSol(List<List<Integer>> allSol, ArrayList<Integer> sol, int[] can, int tar, int i) {
        if (tar > 0) {
            while (i < can.length && tar >= can[i]) {
                sol.add(can[i]);
                findSol(allSol, sol, can, tar - can[i], i);
                sol.removeLast();
                i++;
            }
        } else if (tar == 0) {
            allSol.add(new ArrayList<>(sol));
        }
        return allSol;
    }
}
