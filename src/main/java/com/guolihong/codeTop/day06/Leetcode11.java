package com.guolihong.codeTop.day06;

public class Leetcode11 {
    public int maxArea(int[] height) {
        int ans=0;
        int l=0,r=height.length-1;
        while (l<r){
            ans=Math.max(ans,(r-l)*Math.min(height[l],height[r]));
            if (height[l]<height[r]){
                l++;
            }else{
                r--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Leetcode11 leetcode11=new Leetcode11();
        int res = leetcode11.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
        System.out.println(res);
    }
}
