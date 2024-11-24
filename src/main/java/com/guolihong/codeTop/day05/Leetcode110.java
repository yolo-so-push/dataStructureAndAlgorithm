package com.guolihong.codeTop.day05;

public class Leetcode110 {
    public boolean isBalanced(TreeNode root) {
        return getDepth(root)!=-1;
    }

    private int getDepth(TreeNode root) {
        if (root==null)return 0;
        int leftD = getDepth(root.left);
        if (leftD==-1) return -1;
        int rightD = getDepth(root.right);
        if (rightD==-1) return -1;
        if (Math.abs(leftD-rightD)>1) return -1;
        return 1+Math.max(leftD,rightD);
    }
}
