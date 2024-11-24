package com.guolihong.codeTop.day03;

public class Leetcode72 {
    public int minDistance(String word1, String word2) {
        int n1=word1.length();
        int n2 = word2.length();
        int[][] dp=new int[n1+1][n2+1];
        char[] a1 = word1.toCharArray();
        char[] a2 = word2.toCharArray();
        for (int i = 1; i <=n1; i++) {
            dp[i][0]=i;
        }
        for (int j = 0; j <=n2; j++) {
            dp[0][j]=j;
        }
        for (int i = 1; i <=n1; i++) {
            for (int j = 1; j <=n2; j++) {
                if (a1[i-1]==a2[j-1]){
                    dp[i][j]=dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1]))+1;
                }
            }
        }
        return dp[n1][n2];
    }

    public static void main(String[] args) {
        Leetcode72 leetcode72=new Leetcode72();
        int res = leetcode72.minDistance("horse", "ros");
        System.out.println(res);
    }
}
