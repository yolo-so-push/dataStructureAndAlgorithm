package com.guolihong.pdd;

import java.util.Arrays;
import java.util.Scanner;

public class Test3 {
    //哈希表之线性探测法
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int[] a=new int[n];
        int[] res=new int[m];
        Arrays.fill(res,-1);
        for (int i = 0; i < n; i++) {
            a[i]=scanner.nextInt();
        }
        int idx;
        for (int i = 0; i < n; i++) {
            if (i>=m){
                break;
            }
            idx=a[i]%m;
            if (res[idx] != -1) {
                if (res[idx] == a[i]) continue;
                while (res[idx] != -1) {
                    idx = (idx + 1) % m;
                }
            }
            res[idx]=a[i];
        }
        for (int i = 0; i < m; i++) {
            System.out.print(res[i]+" ");
        }
    }
}
