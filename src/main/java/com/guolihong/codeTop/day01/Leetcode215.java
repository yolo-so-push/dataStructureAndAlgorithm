package com.guolihong.codeTop.day01;

import java.util.Random;

public class Leetcode215 {
    public int findKthLargest(int[] nums, int k) {
        int tar=nums.length-k;
        int l=0,r=nums.length-1;
        int res=nums[0];
        while (l<r){
            int p=partition(nums,l,r);
            if (p==tar){
                return nums[p];
            }else if(p<tar){
                l=p+1;
            }else{
                r=p-1;
            }
        }
        return -1;
    }

    private int partition(int[] nums, int l, int r) {
        swap(nums,l,new Random().nextInt(r-l+1)+l);
        int base=nums[l];
        int i=l,j=r;
        while (true){
            while (i<=j&&nums[i]<base){
                i++;
            }
            while (i<=j&&nums[j]>base){
                j--;
            }
            if (i>=j) break;
            swap(nums,i,j);
            i++;
            j--;
        }
        swap(nums,l,j);
        return j;
    }
    private void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public static void main(String[] args) {
        Leetcode215 leetcode215=new Leetcode215();
        int res = leetcode215.findKthLargest(new int[]{3,2,1,5,6,4}, 2);
        System.out.println(res);
    }
}
