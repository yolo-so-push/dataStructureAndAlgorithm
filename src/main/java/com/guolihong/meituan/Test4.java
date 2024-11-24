package com.guolihong.meituan;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        char[][] a=new char[n][n];
        for (int i = 0; i < n; i++) {
            String s=scanner.next();
            a[i]=s.toCharArray();
        }
        int[][] preSum=new int[n+1][n+1];
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                preSum[i][j]=preSum[i-1][j]+preSum[i][j-1]-preSum[i-1][j-1]+(a[i-1][j-1]-'0');
            }
        }
        for (int k = 1; k <=n; k++) {
            if (k%2!=0){
                System.out.println(0);
                continue;
            }
            int res=0;
            int tar=(k*k)/2;
            for (int i = k; i <=n; i++) {
                for (int j = k; j <=n; j++) {
                    int sum=preSum[i][j]-preSum[i-k][j]-preSum[i][j-k]+preSum[i-k][j-k];
                    if (sum==tar){
                        res++;
                    }
                }
            }
            System.out.println(res);
        }
    }
}
