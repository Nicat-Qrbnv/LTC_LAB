package p7_leetCode.n201_400.n226_InvertBinaryTree;

import p7_leetCode.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        TreeNode n5 = new TreeNode(5);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n6 = new TreeNode(6);
        TreeNode n2 = new TreeNode(2);
        TreeNode n1 = new TreeNode(1);
        n5.left = n3;
        n3.left = n2;
        n2.left = n1;
        n3.right = n4;
        n5.right = n6;

        ArrayList<TreeNode> l = new ArrayList<>(List.of(n5, n3, n6, n2, n4, n1));
        l.forEach(System.out::print);
        invertTree(n5);
        l.forEach(System.out::print);
    }

    public static TreeNode invertTree(TreeNode root) {
        if (root != null) {
            TreeNode temp = invertTree(root.left);
            root.left = invertTree(root.right);
            root.right=temp;
        }
        return root;
    }
}

