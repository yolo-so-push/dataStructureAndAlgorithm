package com.guolihong.codeTop.day05;

import java.sql.PreparedStatement;
import java.util.LinkedList;
import java.util.List;

public class Leetcode78 {
    List<List<Integer>> list=new LinkedList<>();
    LinkedList<Integer> path=new LinkedList<>();
    public List<List<Integer>> subsets(int[] nums) {
        for (int i = 0; i <=nums.length; i++) {
            dfs(nums,i,0);
        }
        return list;
    }

    private void dfs(int[] nums, int count, int idx) {
        if (path.size()==count){
            list.add(new LinkedList<>(path));
            return;
        }
        for (int i = idx; i < nums.length; i++) {
            path.add(nums[i]);
            dfs(nums,count,i+1);
            path.remove(path.size()-1);
        }
    }

    public static void main(String[] args) {
        Leetcode78 leetcode78=new Leetcode78();
        List<List<Integer>> res = leetcode78.subsets(new int[]{1, 2, 3});
        System.out.println(res);
    }
}
