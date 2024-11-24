package com.guolihong.codeTop.day05;

import com.guolihong.codeTop.day02.TreeNode;

public class Leetcode105 {
    public static class TreeNode {
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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return dfs(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }

    private TreeNode dfs(int[] preorder, int pL, int pR , int[] inorder, int iL, int iR) {
        if (pL==pR||iL==iR){
            return new TreeNode(preorder[pL]);
        }
        TreeNode root = new TreeNode(preorder[pL]);
        int num = preorder[pL];
        int i;
        for (i = iL; i <=iR; i++) {
            if (inorder[i]==num){
                break;
            }
        }
        int count = i - iL;
        root.left=dfs(preorder,pL+1,pL+count,inorder,iL,i-1);
        root.right=dfs(preorder,pL+count+1,pR,inorder,i+1,iR);
        return root;
    }
}
