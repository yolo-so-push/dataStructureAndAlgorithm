package com.guolihong.tuwei.xiaomi1012;

import java.util.Scanner;
//TODO 动态规划
public class Test1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        long[] a=new long[n];
        for (int i = 0; i <n; i++) {
            a[i]=scanner.nextLong();
        }
        if (n==1) {
            System.out.println(a[0]);
        }else{
            long[][] dp=new long[n][2];
            dp[1][0]=a[0]+a[1];
            dp[1][1]=-dp[1][0];
            for (int i = 2; i <n; i++) {
                dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1])+a[i];
                dp[i][1]=Math.max(dp[i-1][1]+2*a[i-1],dp[i-1][0]-2*a[i-1])-a[i];
            }
            System.out.println(Math.max(dp[n-1][0],dp[n-1][1]));
        }

    }
}
