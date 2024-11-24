package itheima.day02.codeTop;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Leetcode103 {
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

    List<List<Integer>> res=new ArrayList<>();
    Deque<TreeNode> stack=new LinkedList<>();
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        boolean ji=true;
        if (root==null) return new ArrayList<>();
        stack.push(root);
        while (!stack.isEmpty()){
            int size = stack.size();
            List<Integer> path=new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode pop = stack.pop();
                path.add(pop.val);
                if (pop.left!=null){
                    stack.push(pop.left);
                }
                if (pop.right!=null){
                    stack.push(pop.right);
                }
                if (!ji){
                    int l=0,r=path.size()-1;
                    while (l<r){
                        int temp=path.get(l);
                        path.set(l,path.get(r));
                        path.set(r,temp);
                        l++;
                        r--;
                    }
                }
                ji=!ji;
            }
            res.add(path);
        }
        return res;
    }
}
