package com.guolihong.codeTop.day04;

import java.util.LinkedList;
import java.util.List;

public class Leetcode22 {
    List<String> res=new LinkedList<>();
    public List<String> generateParenthesis(int n) {
        StringBuilder stringBuilder=new StringBuilder();
        dfs(stringBuilder,n,n);
        return res;
    }

    private void dfs(StringBuilder stringBuilder, int left, int right) {
        if (left==0&&right==0){
            res.add(new String(stringBuilder));
            return;
        }
        if (left>0){
            stringBuilder.append("(");
            left--;
            dfs(stringBuilder,left,right);
            left++;
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
        }
        if (left<right){
            stringBuilder.append(")");
            right--;
            dfs(stringBuilder,left,right);
            right++;
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
        }
    }

    public static void main(String[] args) {
        Leetcode22 leetcode22 = new Leetcode22();
        List<String> list = leetcode22.generateParenthesis(3);
        System.out.println(list);
    }
}
