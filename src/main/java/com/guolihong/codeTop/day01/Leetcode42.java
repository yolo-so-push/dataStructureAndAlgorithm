package com.guolihong.codeTop.day01;

import java.util.Deque;
import java.util.LinkedList;

public class Leetcode42 {
    public int trap(int[] height) {
        Deque<Integer> deque=new LinkedList<>();
        deque.add(0);
        int res=0;
        for (int i = 1; i <height.length; i++) {
            while (!deque.isEmpty()&&height[deque.peek()]<height[i]){
                Integer poll = deque.poll();
                if (deque.isEmpty()) continue;
                Integer left = deque.peek();
                int h=Math.min(height[left],height[i])-height[poll];
                res+=h*(i-left-1);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Leetcode42 leetcode42=new Leetcode42();
        int res = leetcode42.trap(new int[]{4,2,0,3,2,5});
        System.out.println(res);
    }
}
