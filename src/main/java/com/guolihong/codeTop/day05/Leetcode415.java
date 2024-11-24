package com.guolihong.codeTop.day05;

public class Leetcode415 {
    public String addStrings(String num1, String num2) {
        int i=num1.length()-1,j=num2.length()-1;
        StringBuilder res=new StringBuilder();
        char[] a1 = num1.toCharArray();
        char[] a2 = num2.toCharArray();
        int pre=0;
        while (i>=0||j>=0){
            int x=i>=0?a1[i]-'0':0;
            int y=j>=0?a2[j]-'0':0;
            int sum=x+y+pre;
            pre=sum/10;
            res.insert(0,sum%10);
            i--;
            j--;
        }
        if (pre!=0){
            res.insert(0,pre);
        }
        return res.toString();
    }
}
