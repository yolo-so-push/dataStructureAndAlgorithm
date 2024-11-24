package com.guolihong.codeTop.day01;

import java.util.Arrays;

public class Leetcode300 {
    public int lengthOfLIS(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,1);
        int max=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i]>nums[j]){
                    dp[i]=Math.max(dp[i],1+dp[j]);
                }
                max=Math.max(dp[i],max);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Leetcode300 leetcode300=new Leetcode300();
        int res = leetcode300.lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18});
        System.out.println(res);
    }
}
