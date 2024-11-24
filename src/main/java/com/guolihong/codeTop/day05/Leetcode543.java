package com.guolihong.codeTop.day05;

public class Leetcode543 {
    int res=0;
    public int diameterOfBinaryTree(TreeNode root) {
       dfs(root);
       return res;
    }

    private int dfs(TreeNode root) {
        if (root==null||(root.left==null&&root.right==null)){
            return 0;
        }
        int leftLen = 0;
        if (root.left!=null){
            leftLen = 1 + dfs(root.left);
        }
        int rightLen = 0;
        if (root.right!=null){
            rightLen=1+dfs(root.right);
        }
        res=Math.max(res,leftLen+rightLen);
        return Math.max(leftLen,rightLen);
    }

}
