package com.guolihong.codeTop.day05;



public class Leetcode129 {
    int res = 0;

    public int sumNumbers(TreeNode root) {
        dfs(root, 0);
        return res;
    }

    private void dfs(TreeNode root, int i) {
        if (root == null) {
            return;
        }
        i = i * 10 + root.val;
        if (root.left==root.right){
            res+=i;
            return;
        }
        dfs(root.left,i);
        dfs(root.left,i);
    }


    public static void main(String[] args) {
        Leetcode129 leetcode129 = new Leetcode129();
        int res = leetcode129.sumNumbers(new TreeNode(4, new TreeNode(9, new TreeNode(5), new TreeNode(1)), new TreeNode(0)));
        System.out.println(res);

    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
