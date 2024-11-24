package com.guolihong.pdd;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        String s=scanner.next();
        int res=1;
        char[] a = s.toCharArray();
        int[] dp=new int[n];
        dp[0]=1;
        for (int i = 1; i < n; i++) {
            if (a[i]!=a[i-1]){
                dp[i]=dp[i-1]+1;
            }else{
                dp[i]=1;
            }
            res=Math.max(dp[i],res);
        }
        System.out.println(res);
    }
}
