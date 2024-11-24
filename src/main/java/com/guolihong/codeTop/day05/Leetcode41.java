package com.guolihong.codeTop.day05;

import java.util.HashSet;
import java.util.Set;

public class Leetcode41 {
    public int firstMissingPositive(int[] nums) {
        int[] a=new int[nums.length+1];
        for (int num : nums) {
            if (num<=nums.length&&num>=0){
                a[num]++;
            }
        }
        for (int i = 1; i < a.length; i++) {
            if (a[i]==0){
                return i;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Leetcode41 leetcode41=new Leetcode41();
        int res = leetcode41.firstMissingPositive(new int[]{1,2,0});
        System.out.println(res);
    }
}
