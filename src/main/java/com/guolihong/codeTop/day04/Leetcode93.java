package com.guolihong.codeTop.day04;

import java.util.LinkedList;
import java.util.List;

public class Leetcode93 {
    List<String> res=new LinkedList<>();

    public List<String> restoreIpAddresses(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        dfs(stringBuilder,0,0);
        return res;
    }

    private void dfs(StringBuilder stringBuilder, int i, int count) {
        if (count==3){
            if (isVaild(stringBuilder,i,stringBuilder.length()-1)){
                res.add(new String(stringBuilder));
            }
            return;
        }
        for (int j = i; j <stringBuilder.length(); j++) {
            if (isVaild(stringBuilder,i,j)){
                stringBuilder.insert(j+1,".");
                dfs(stringBuilder,j+2,count+1);
                stringBuilder.deleteCharAt(j+1);
            }
        }
    }

    private boolean isVaild(StringBuilder stringBuilder, int i, int j) {
        if (i>j){
            return false;
        }
        if (i!=j&&stringBuilder.charAt(i)=='0'){
            return false;
        }
        int sum=0;
        for (int k = i; k <=j; k++) {
            sum=sum*10+stringBuilder.charAt(k)-'0';
            if (sum>255) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Leetcode93 leetcode93=new Leetcode93();
        List<String> res = leetcode93.restoreIpAddresses("25525511135");
        System.out.println(res);
    }
}
