package com.guolihong.zt;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * 从底层开始，如果当前节点为左孩子节点，则变为父节点的右孩子节点，如果当前节点为右孩子节点，则变为当前节点同级的右边节点的左孩子节点，如果当前节点为最右边节点（没有右边的节点），则变为当前节点的同级节点的最左边节点的右孩子节点。
 * 循环k次。
 */
public class Test2 {
    public static class TreeNode {
     int val = 0;
     TreeNode left = null;
     TreeNode right = null;
     public TreeNode(int val) {
       this.val = val;
     }
 }
    static List<List<TreeNode>> list=new ArrayList<>();
    static List<TreeNode> path=new ArrayList<>();
    private void iteTree(TreeNode root){
        path.add(root);
        while (!path.isEmpty()){
            int size = path.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = path.get(i);
                if (node.left!=null){
                    path.add(node.left);
                }
                if (node.right!=null){
                    path.add(node.right);
                }
                i++;
            }
            list.add(new ArrayList<>(path));
            path=new ArrayList<>();
        }
    }

    public static void main(String[] args) {
        Test2 test2=new Test2();
        TreeNode node = new TreeNode(1);
        node.left=new TreeNode(2);
        TreeNode right = new TreeNode(3);
        right.left=new TreeNode(4);
        right.right=new TreeNode(5);
        node.right=right;
        test2.iteTree(node);
        for (int i = 0; i < test2.list.size(); i++) {
            for (int j = 0; j < test2.list.get(i).size(); j++) {
                System.out.print(test2.list.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
    public TreeNode cyclicShiftTree (TreeNode root, int k) {
        while (k-->0){
            root=dfs(root);
        }
        return root;
    }
    Deque<TreeNode> deque=new LinkedList<>();
    private TreeNode dfs(TreeNode root) {
        TreeNode left = root.left;
        TreeNode right = root.right;
        if (root==null){
            return null;
        }
        root.right=dfs(root.left);

        return root;
    }
}
