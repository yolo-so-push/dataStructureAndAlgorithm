package com.guolihong.codeTop.day05;

public class Leetcode101 {
    public boolean isSymmetric(TreeNode root) {
        return dfs(root.left,root.right);
    }

    private boolean dfs(TreeNode left, TreeNode right) {
        if (left==null&&right==null){
            return true;
        }
        if (left==null||right==null||left.val!=right.val){
            return false;
        }
        boolean b1 = dfs(left.right, right.left);
        boolean b2 = dfs(left.left, right.right);
        return b1&b2;
    }


}
