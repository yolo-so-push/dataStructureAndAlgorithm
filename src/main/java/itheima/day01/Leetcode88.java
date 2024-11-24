package itheima.day01;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Leetcode88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1,j=n-1;
        int k=n+m-1;
        while(i>=0&&j>=0){
            if(nums1[i]>=nums2[j]){
                nums1[k]=nums1[i];
                i--;
            }else{
                nums1[k]=nums2[j];
                j--;
            }
            k--;
        }
        while(i>=0){
            nums1[k]=nums1[i];
            i--;
            k--;
        }
        while(j>=0){
            nums1[k]=nums2[j];
            j--;
            k--;
        }
    }

    public static void main(String[] args) {
        Leetcode88 leetcode88=new Leetcode88();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {4, 5, 6};
        leetcode88.merge(nums1,3, nums2,3);
        System.out.println(Arrays.toString(nums1));
    }
}
