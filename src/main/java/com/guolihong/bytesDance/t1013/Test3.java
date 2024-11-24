package com.guolihong.bytesDance.t1013;

import java.util.Scanner;
//TODO 1
public class Test3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int T=scanner.nextInt();
        while (T-->0){
            int n=scanner.nextInt();
            String s=scanner.next();
            int[] a=new int[n];
            for (int i = 0; i < s.length(); i++) {
                a[i]=s.charAt(i)-'0';
            }
            int[][] f=new int[n][n];
            for (int i = 0; i < n; i++) {
                int[] cnt=new int[n+1];
                int minv=0;
                for (int j = i; j <n; j++) {
                    cnt[a[j]]=1;
                    while (minv<=n&&cnt[minv]==1) minv++;
                    f[i][j]=minv;
                }
            }
            int[] dp=new int[n];
            for (int i = 0; i < n; i++) {
                dp[i]=f[0][i];
                for (int j = 0; j < i; j++) {
                    dp[i]=Math.max(dp[i],dp[j]+f[j+1][i]);
                }
            }
            System.out.println(dp[n-1]);
        }
    }
}
