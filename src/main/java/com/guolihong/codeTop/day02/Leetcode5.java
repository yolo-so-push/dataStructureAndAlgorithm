package com.guolihong.codeTop.day02;

public class Leetcode5 {
    public String longestPalindrome(String s) {
        int n = s.length();
        char[] a = s.toCharArray();
        boolean[][] dp=new boolean[n][n];
        for (int i = 0; i < n; i++) {
            dp[i][i]=true;
        }
        int max=1;
        String res="";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (i-j<=2){
                    dp[j][i]=a[i]==a[j];
                }else{
                    dp[j][i]=dp[j+1][i-1]&&a[j]==a[i];
                }
                if (dp[j][i]&&max<i-j+1){
                    max=i-j+1;
                    res=s.substring(j,i+1);
                }
            }
        }
        return res;
    }
}
