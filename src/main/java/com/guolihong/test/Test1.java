package com.guolihong.test;

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=scanner.nextInt();
        }
        Arrays.sort(a);
        long max=(long)a[0]*a[1]*a[2];
        max=Math.max(max,(long)a[n-1]*a[n-2]*a[n-3]);
        max=Math.max(max,(long)a[0]*a[1]*a[n-1]);
        System.out.println(max);
    }
}
