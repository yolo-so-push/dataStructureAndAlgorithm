package com.guolihong.codeTop.day06;

import java.util.Arrays;

public class Leetcode34 {
    public int[] searchRange(int[] nums, int target) {
        int[] res=new int[2];
        Arrays.fill(res,-1);
        for (int i = 0; i < nums.length; i++) {
            if (res[1]!=-1&&nums[i]!=target) break;
            if (nums[i]==target){
                if (res[0]==-1){
                    res[0]=i;
                }else{
                    res[1]=i;
                }
            }

        }
        if (res[0]!=-1&&res[1]==-1) res[1]=res[0];
        return res;
    }
}
