package com.guolihong.pdd;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeOne {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] h=new int[n];
        for (int i = 0; i < n; i++) {
            h[i]=scanner.nextInt();
        }
        int m=scanner.nextInt();
        int[] w=new int[m];
        for (int i = 0; i < m; i++) {
            w[i]=scanner.nextInt();
        }
        Arrays.sort(h);
        Arrays.sort(w);
        int[] flag=new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (flag[j]!=1&&w[i]>=h[j]){
                    flag[j]=1;
                    break;
                }
            }
        }
        int res=0;
        for (int i = 0; i < n; i++) {
            res+=flag[i];
        }
        System.out.println(res);
    }
}
