package itheima.day02.codeTop;

public class Leetcode215 {
    public static void main(String[] args) {
        Leetcode215 leetcode215=new Leetcode215();
        int res = leetcode215.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2);
        System.out.println(res);
    }
    public int findKthLargest(int[] nums, int k) {
        int i=0,j=nums.length-1;
        int tar=nums.length-k;
        while (i<=j){
            int p=partition(nums,i,j);
            if (p==tar){
                return nums[p];
            }else if(p<tar){
                i=p+1;
            }else{
                j=p-1;
            }
        }
        return -1;
    }

    private int partition(int[] nums, int i, int j) {
        int base=nums[i];
        int l=i+1,r=j;
        while (l<=r){
            while (l<=r&&nums[l]<base){
                l++;
            }
            while (l<=r&&nums[r]>base){
                r--;
            }
            if (l>r){
                break;
            }
            swap(nums,l,r);
            l++;
            r--;
        }
        swap(nums,i,r);
        return r;
    }

    private void swap(int[] nums, int l, int r) {
        int temp=nums[l];
        nums[l]=nums[r];
        nums[r]=temp;
    }
}
