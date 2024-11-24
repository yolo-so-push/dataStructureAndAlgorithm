package com.guolihong.codeTop.day06;

public class Leeetcode98 {
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
    private long pre=Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        return dfs(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }

    private boolean dfs(TreeNode root, long minValue, long maxValue) {
        if (root==null) return true;
        int x = root.val;
        if(dfs(root.left,minValue,x)) return true;
        if (dfs(root.right,x,maxValue)) return true;
        return x>minValue&&x<maxValue;
    }


}
