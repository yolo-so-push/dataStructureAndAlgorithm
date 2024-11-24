package com.guolihong.codeTop.day04;

import java.util.Arrays;

public class Leetcode31 {
    //13425->13452
    //13452
    public void nextPermutation(int[] nums) {
        int i=nums.length-2;
        while (i>=0&&nums[i]>=nums[i+1]){
            i--;
        }
        if (i>=0){
            int j=nums.length-1;
            while (j>=0&&nums[j]<=nums[i]){
                j--;
            }
            swap(nums,i,j);
        }else{
            reverse(nums,i+1,nums.length-1);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    private void reverse(int[] nums, int i, int j) {
        while (i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Leetcode31 leetcode31=new Leetcode31();
        int[] a = {1, 3, 4, 2, 5};
        leetcode31.nextPermutation(a);
        System.out.println(Arrays.toString(a));
    }
}
