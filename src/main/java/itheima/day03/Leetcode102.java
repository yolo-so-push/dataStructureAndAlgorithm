package itheima.day03;

import java.util.*;
import java.util.Queue;

public class Leetcode102 {

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
    List<List<Integer>> res=new ArrayList<>();
    List<Integer> path=new ArrayList<>();
    Queue<TreeNode> queue=new LinkedList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root==null){
            return res;
        }
        queue.offer(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            path=new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                path.add(poll.val);
                if (poll.left!=null) queue.offer(poll.left);
                if (poll.right!=null) queue.offer(poll.right);
            }
            res.add(path);
        }
        return res;
    }

    public static void main(String[] args) {
        Leetcode102 leetcode102=new Leetcode102();
        List<List<Integer>> res = leetcode102.levelOrder(new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7))));
        System.out.println(res);
    }
}
