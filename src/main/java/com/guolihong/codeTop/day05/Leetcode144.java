package com.guolihong.codeTop.day05;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Leetcode144 {
    List<Integer> res=new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        dfs(root);
        return res;
    }

    private void dfs(TreeNode root) {
        if (root==null) return;
        res.add(root.val);
        if (root.left!=null) dfs(root.left);
        if (root.right!=null) dfs(root.right);
    }
}
