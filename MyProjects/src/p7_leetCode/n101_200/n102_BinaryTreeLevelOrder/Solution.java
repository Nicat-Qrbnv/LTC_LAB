package p7_leetCode.n101_200.n102_BinaryTreeLevelOrder;

import p7_leetCode.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void main(String[] args) {

    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> allLevels = new ArrayList<>();
        recursive(root,0,allLevels);
        return allLevels;
    }

    public void recursive(TreeNode currNode, int currLevel, List<List<Integer>> allLevels){
        if(currNode == null) return;

        if(allLevels.size() == currLevel){
            List<Integer> level = new ArrayList<>();
            level.add(currNode.val);
            allLevels.add(level);
        }else{
            allLevels.get(currLevel).add(currNode.val);
        }

        recursive(currNode.left,currLevel+1,allLevels);
        recursive(currNode.right,currLevel+1,allLevels);
    }

}
