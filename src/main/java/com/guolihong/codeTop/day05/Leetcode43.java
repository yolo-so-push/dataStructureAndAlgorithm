package com.guolihong.codeTop.day05;

import com.guolihong.codeTop.day01.Leetcode143;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Leetcode43 {
    public String multiply(String num1, String num2) {
        if (num1 == "0" || num2 == "0") return "0";
        char[] a1 = num1.toCharArray();
        char[] a2 = num2.toCharArray();
        int n1 = num1.length();
        int n2 = num2.length();
        int[] res=new int[n1+n2];
        for (int i = n1-1; i>=0; i--) {
            int x=a1[i]-'0';
            for (int j =n2-1; j>=0; j--) {
                int y=a2[j]-'0';
                res[i+j+1]+=x*y;
            }
        }
        for (int i = n1+n2-1; i>0; i--) {
            res[i-1]+=res[i]/10;
            res[i]%=10;
        }
        StringBuilder s=new StringBuilder();
        for (int i = 0; i < res.length; i++) {
            s.append(res[i]);
        }
        if (s.indexOf("0")==0){
            s.deleteCharAt(0);
        }
        return s.toString();
    }

    public static void main(String[] args) {
        Leetcode43 leetcode43=new Leetcode43();
        String res = leetcode43.multiply("123", "0");
        System.out.println(res);
    }
}
