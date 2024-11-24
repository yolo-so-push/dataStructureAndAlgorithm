package com.guolihong.codeTop.day05;

public class Leetcode104 {
    public int maxDepth(TreeNode root) {
        if (root==null){
            return 0;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return Math.max(leftDepth,rightDepth)+1;
    }
}
