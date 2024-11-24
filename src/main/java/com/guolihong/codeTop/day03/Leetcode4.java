package com.guolihong.codeTop.day03;

public class Leetcode4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int count = nums1.length + nums2.length;
        int t=0;
        int i=0,j=0;
        while (t<(count-1)/2){
            while (t<(count-1)/2&&((i<nums1.length&&nums1[i]<=nums2[j])||j>=nums2.length)){
                i++;
                t++;
            }
            while (t<(count-1)/2&&(i>=nums1.length||(j < nums2.length && nums2[j] <=nums1[i]))){
                j++;
                t++;
            }
        }
        double res = 0;
        if (count%2!=0){
            if (i<nums1.length&&j<nums2.length){
                res= Math.min(nums1[i], nums2[j]);
            }
            else if (i>=nums1.length){
                res=nums2[j];
            }else{
                res=nums1[i];
            }
        }else{
            int x1,x2;
            int cnt=0;
            while (cnt<2){
                if (i<nums1.length&&j<nums2.length){
                    if (nums1[i]<nums2[j]){
                        res+=nums1[i];
                        i++;
                    }else{
                        res+=nums2[j];
                        j++;
                    }
                    cnt++;
                }else if (i<nums1.length){
                    res+=nums1[i];
                    i++;
                    cnt++;
                }else{
                    res+=nums2[j];
                    j++;
                    cnt++;
                }
            }
            res=res/2;
        }
        return res;
    }

    public static void main(String[] args) {
        Leetcode4 leetcode4=new Leetcode4();
        double res = leetcode4.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4});
        System.out.println(res);
    }
}
