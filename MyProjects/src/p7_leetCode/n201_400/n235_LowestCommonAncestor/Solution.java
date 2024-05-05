package p7_leetCode.n201_400.n235_LowestCommonAncestor;

import p7_leetCode.TreeNode;

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

        System.out.println(lowestCommonAncestor(n5, n1, n4));
    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode sml = p.val < q.val ? p : q;
        TreeNode big = p.val > q.val ? p : q;
        if (sml.val <= root.val && root.val <= big.val) {
            return root;
        } else if (big.left == sml) {
            return big;
        } else if (sml.right == big) {
            return sml;
        } else if (big.val < root.val) {
            return lowestCommonAncestor(root.left, sml, big);
        } else {
            return lowestCommonAncestor(root.right, sml, big);
        }
    }
}