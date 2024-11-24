package com.guolihong.codeTop.day03;

public class Leetcode1143 {
    public int longestCommonSubsequence(String text1, String text2) {
        int n1 = text1.length();
        int n2 = text2.length();
        int[][] dp=new int[n1+1][n2+1];
        char[] a1 = text1.toCharArray();
        char[] a2 = text2.toCharArray();
        for (int i = 1; i <=n1; i++) {
            for (int j = 1; j <=n2; j++) {
                if (a1[i-1]==a2[j-1]){
                    dp[i][j]=dp[i-1][j-1]+1;
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n1][n2];
    }

    public static void main(String[] args) {
        Leetcode1143 leetcode1143=new Leetcode1143();
        int res = leetcode1143.longestCommonSubsequence("abece", "abc");
        System.out.println(res);
    }

}
