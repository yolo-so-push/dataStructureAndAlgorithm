package com.guolihong.codeTop.day04;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Leetcode239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        LinkedList<Integer> list=new LinkedList<>();
        int[] res=new int[nums.length-k+1];
        int i=0;
        for (int j = 0; j < nums.length; j++) {
            while (!list.isEmpty()&&j-k>=list.peekFirst()){
                list.pollFirst();
            }
            while (!list.isEmpty()&&nums[j]>nums[list.peekLast()]){
                list.pollLast();
            }
            list.offer(j);
            if (j>=k-1){
                res[i++]=nums[list.peekFirst()];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Leetcode239 leetcode239=new Leetcode239();
        int[] res = leetcode239.maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3);
        System.out.println(Arrays.toString(res));
    }
}
