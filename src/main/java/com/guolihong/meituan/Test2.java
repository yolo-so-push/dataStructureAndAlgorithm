package com.guolihong.meituan;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int k=scanner.nextInt();
        String s=scanner.next();
        char[] a = s.toCharArray();
        int res=0;
        for (char c : a) {
            if (c=='M'||c=='T'){
                res++;
            }
        }
        System.out.println(Math.min(res + k, n));
    }
}
