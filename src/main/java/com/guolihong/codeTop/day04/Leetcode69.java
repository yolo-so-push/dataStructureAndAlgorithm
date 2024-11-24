package com.guolihong.codeTop.day04;

public class Leetcode69 {
    public int mySqrt(int x) {
        if(x<=1) return x;
        int i=1,j=x-1;
        while (i<=j){
            int m=(i+j)>>1;
            if ((long)m*m==x){
                return m;
            }else if((long)m*m<x){
                i=m+1;
            }else{
                j=m-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Leetcode69 leetcode69=new Leetcode69();
        int res = leetcode69.mySqrt(5);
        System.out.println(res);
    }
}
