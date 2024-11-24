package com.guolihong.codeTop.day06;

import java.util.Deque;
import java.util.LinkedList;

public class Leetcode394 {
    public String decodeString(String s) {
        Deque<Character> stack=new LinkedList<>();
        Deque<Character> list=new LinkedList<>();
        char[] a = s.toCharArray();
        for (char c : a) {
            if (c==']'){
                list=new LinkedList<>();
                while (stack.peek()!='['){
                    Character pop = stack.pop();
                    list.push(pop);
                }
                stack.pop();
                StringBuilder count=new StringBuilder();
                while (!stack.isEmpty()&&stack.peek()>='0'&&stack.peek()<='9'){
                    count.insert(0,stack.pop());
                }
                int cnt = Integer.parseInt(count.toString()) - '0';
                for (int i = 0; i < cnt; i++) {
                    for (Character ch : list) {
                        stack.push(ch);
                    }
                }
            }else{
                stack.push(c);
            }
        }
        StringBuilder res=new StringBuilder();
        while (!stack.isEmpty()){
            res.append(stack.pollLast());
        }
        return res.toString();
    }

    public static void main(String[] args) {
        Leetcode394 leetcode394=new Leetcode394();
        String res = leetcode394.decodeString("100[leetcode]");
        System.out.println(res);
    }
}
