package com.guolihong.codeTop.day05;

import java.sql.PreparedStatement;
import java.util.Deque;
import java.util.LinkedList;

public class Leetcode32 {
    public int longestValidParentheses(String s) {
        Deque<Integer> stack=new LinkedList<>();
        char[] a = s.toCharArray();
        int res=0;
        stack.push(-1);
        for (int i = 0; i < a.length; i++) {
            if (a[i]=='('){
                stack.push(i);
            }else{
                Integer pop = stack.pop();
                if (stack.isEmpty()){
                    stack.push(i);
                }else{
                    res=Math.max(res,i-stack.peek());
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Leetcode32 leetcode32=new Leetcode32();
        int res = leetcode32.longestValidParentheses("())((())");
        System.out.println(res);
    }
}
