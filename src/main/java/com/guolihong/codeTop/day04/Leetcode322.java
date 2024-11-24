package com.guolihong.codeTop.day04;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Leetcode322 {
    public int coinChange(int[] coins, int amount) {
        int[] dp=new int[amount+1];
        Arrays.fill(dp,amount+1);
        for (int i = 0; i < coins.length; i++) {
            for (int j = coins[i]; j <=amount; j++) {
                dp[j]=Math.min(dp[j],dp[j-coins[i]]+1);
            }
        }
        return dp[amount]>amount?-1:dp[amount];
    }

    public static void main(String[] args) {
        Leetcode322 leetcode322=new Leetcode322();
        int res = leetcode322.coinChange(new int[]{2, 5,1}, 11);
        System.out.println(res);
    }
}
