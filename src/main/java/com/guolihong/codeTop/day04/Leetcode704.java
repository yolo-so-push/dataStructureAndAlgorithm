package com.guolihong.codeTop.day04;

public class Leetcode704 {
    public int search(int[] nums, int target) {
        int i=0,j=nums.length-1;
        while (i<j){
            int m=(i+j)>>1;
            if (nums[m]==target){
                return m;
            }else if (nums[m]<target){
                i=m+1;
            } else{
                j=m-1;
            }
        }
        return nums[i]==target?i : -1;
    }
}
