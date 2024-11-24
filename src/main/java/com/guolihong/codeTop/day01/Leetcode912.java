package com.guolihong.codeTop.day01;

import java.util.Arrays;
import java.util.Random;

public class Leetcode912 {
    public int[] sortArray(int[] nums) {
        sort(nums,0,nums.length-1);
        return nums;
    }

    private void sort(int[] nums, int i, int j) {
        if (i>j) return;
        int p=partition(nums,i,j);
        sort(nums,i,p-1);
        sort(nums,p+1,j);
    }

    private int partition(int[] nums, int i, int j) {
        swap(nums,i,new Random().nextInt(j-i+1)+i);
        int base=nums[i];
        int l=i+1,r=j;
        while (true){
            while (l<=r&&nums[l]<base){
                l++;
            }
            while (l<=r&&nums[r]>base){
                r--;
            }
            if (l>=r) break;
            swap(nums,l,r);
            l++;
            r--;
        }
        swap(nums,i,r);
        return r;
    }
    private void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public static void main(String[] args) {
        Leetcode912 leetcode912=new Leetcode912();
        int[] ints = leetcode912.sortArray(new int[]{5, 3, 4, 7, 1, 9, 2, 0, 1});
        System.out.println(Arrays.toString(ints));
    }
}
