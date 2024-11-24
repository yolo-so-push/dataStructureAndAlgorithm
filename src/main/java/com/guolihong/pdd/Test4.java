package com.guolihong.pdd;

import java.util.*;
import java.util.stream.Collectors;

public class Test4 {
    // 5
    //12 34 8 5 17
    // 3 8 9 1 10
    //5*1+12*3+8*10
    // 0 24 8 0 17 26
    //5*1+11*3+8*10
    //1 24 8 0 17
    //4*2+4*5=28
    //3*2+4*5
    //5
    // 11 12 13 14 15
    // 11 12 13 14 15
    // 11*11+5*12
    //小多把自己得糖果吃完了，想从朋友哪里买糖果，
    //每个小朋友得糖果价格不一样，第一行输入小朋友个数，第二行输入每个小朋友拥有得糖果个数，
    //第三行输入每个小朋友糖果得价格，小多如何购买糖果可以使自己得糖果最多，并且花费最少。
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        Map<Integer,Integer> countMap=new HashMap<>();
        int maxCount=0;
        int res=0;
        int count=0;
        for (int i = 0; i < n; i++) {
            a[i]=scanner.nextInt();
            countMap.put(i,a[i]);
            maxCount=Math.max(maxCount,a[i]);
        }
        Map<Integer,Integer> valMap=new HashMap<>();
        for (int i = 0; i < n; i++) {
            b[i]=scanner.nextInt();
            valMap.put(b[i],i);
        }
        Arrays.sort(b);
        for (int i = 0; i < n; i++) {
            if (count<maxCount){

            }
        }
    }
}
