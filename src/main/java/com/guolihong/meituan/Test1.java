package com.guolihong.meituan;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int q=scanner.nextInt();
        int[] a=new int[n];
        int cnt0=0;
        long sum=0;
        for (int i = 0; i < n; i++) {
            a[i]=scanner.nextInt();
            if (a[i]==0) cnt0++;
            sum+=a[i];
        }
        while (q-->0){
            int l=scanner.nextInt();
            int r=scanner.nextInt();
            System.out.print((sum+ (long) cnt0 *l)+" "+(sum+ (long) cnt0 *r));
            System.out.println();
        }
    }
}
