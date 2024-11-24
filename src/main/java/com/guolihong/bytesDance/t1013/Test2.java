package com.guolihong.bytesDance.t1013;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int T=scanner.nextInt();
        while (T-->0){
            int n=scanner.nextInt();
            int k=scanner.nextInt();
            String s=scanner.next();
            char[] a = s.toCharArray();
            if (!s.contains("0")|| !s.contains("1")||k==0){
                System.out.println(s);
                continue;
            }
            int i=0,j=s.length()-1;
            while (k>0&&i<j){
                while (i<j&&a[i]!='1'){
                    i++;
                }
                while (i<j&&a[j]!='0'){
                    j--;
                }
                char temp = a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
                j--;
                k--;
            }
            System.out.println(new String(a));
        }
    }
}
