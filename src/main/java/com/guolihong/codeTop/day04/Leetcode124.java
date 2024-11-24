package com.guolihong.codeTop.day04;

import com.guolihong.codeTop.day02.TreeNode;

import java.sql.PreparedStatement;

public class Leetcode124 {
    public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }
    private int res=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return res;
    }

    private int dfs(TreeNode root) {
        if (root==null){
            return 0;
        }
        int left = dfs(root.left);
        int right = dfs(root.right);
        res=Math.max(res,left+right+root.val);
        return Math.max(Math.max(left,right)+root.val,0);
    }

}
