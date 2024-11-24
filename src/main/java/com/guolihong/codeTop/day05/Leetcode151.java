package com.guolihong.codeTop.day05;

import java.util.Arrays;

public class Leetcode151 {
    public String reverseWords(String s) {
         s = s.trim();
        String[] split = s.split(" ");
        int i=0,j=split.length-1;
        while (i<j){
            String temp = split[i];
            split[i]=split[j];
            split[j]=temp;
            i++;
            j--;
        }
        StringBuilder stringBuilder=new StringBuilder();
        for (int k = 0; k < split.length-1; k++) {
            if(split[k]!=" ") {
                stringBuilder.append(split[k]).append("");
            }
        }
        stringBuilder.append(split[split.length-1]);
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Leetcode151 leetcode151=new Leetcode151();
        String res = leetcode151.reverseWords("the sky is blue");
        System.out.println(res);
    }
}
