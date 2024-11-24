package com.guolihong.tuwei.T1031;

import java.util.Arrays;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] a1=new int[n];
        int[] a2=new int[n];
        for (int i = 0; i < n; i++) {
            a1[i]=scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            a2[i]=scanner.nextInt();
        }
        int[] dp=new int[n];
        int res=0;
        for (int i = 0; i < n; i++) {
            if (a1[i]==a2[i]){
                if (i>0){
                    dp[i]=-1;
                    for (int j = 0; j < i; j++) {
                        if (dp[j]==-1){
                            dp[i]=i+j;
                            dp[j]=dp[i];
                            res+=dp[i];
                        }
                    }
                }else{
                    dp[i]=-1;
                }
            }else{
               if (i>0){
                   dp[i]=dp[i-1];
               }
            }
        }
        for (int i = 0; i < n; i++) {
            if (dp[i]==-1) res=-1;
        }
        System.out.println(res);
    }
}
