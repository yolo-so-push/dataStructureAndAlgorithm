package com.guolihong.codeTop.day04;

public class Leetcode76 {
    public String minWindow(String s, String t) {
       if (s.length()<t.length()){
           return "";
       }
       int[] a1=new int[128];
       int[] a2=new int[128];
       int ansLeft=-1,ansRight=s.length()-1;
       int kind=0;
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            a2[c]++;
            if (a2[c]==1) kind++;
        }
        int i=0;
        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);
            a1[c]++;
            if (a1[c]==a2[c]) kind--;
            while (kind==0){
                if (ansRight-ansLeft>j-i){
                    ansLeft=i;
                    ansRight=j;
                }
                char c1 = s.charAt(i);
                a1[c1]--;
                if (a1[c1]<a2[c1]) kind++;
                i++;
            }
        }
        return ansLeft<0?"":s.substring(ansLeft,ansRight+1);
    }

    public static void main(String[] args) {
        Leetcode76 leetcode76=new Leetcode76();
        String res = leetcode76.minWindow("ADOBECODEBANC", "ABC");
        System.out.println(res);
        System.out.println((int)'z'-(int)'A');
    }
}
