package com.guolihong.codeTop.day05;

import java.util.ArrayList;
import java.util.List;

public class Leetcode39 {
    List<List<Integer>> res=new ArrayList<>();
    List<Integer> path=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        dfs(candidates,target,0);
        return res;
    }

    private void dfs(int[] candidates, int target,int idx) {
        if (target<0){
            return;
        }
        if (target==0){
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = idx; i <candidates.length; i++) {
            target-=candidates[i];
            path.add(candidates[i]);
            dfs(candidates,target,i);
            target+=candidates[i];
            path.remove(path.size()-1);
        }
    }

    public static void main(String[] args) {
        Leetcode39 leetcode39=new Leetcode39();
        List<List<Integer>> res = leetcode39.combinationSum(new int[]{2, 3, 6, 7}, 7);
        System.out.println(res);
    }
}
