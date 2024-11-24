package itheima.day02;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        InsertSort insertSort=new InsertSort();
        int[] a=new int[]{2,4,2,9,3,5,0,2,1};
        insertSort.recursion(a,a.length);
        System.out.println(Arrays.toString(a));
    }
    private void insertSort(int[] a){
        int n=a.length;
        for (int i = 1; i <n; i++) {
            int key=a[i];
            int j=i-1;
            while (j>=0&&a[j]>key){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
        }
    }

    /**
     * 递归实现插入排序
     */
//    1 2 3 4
    private void recursion(int[] a,int n){
        if (n<=1){
            return;
        }
        recursion(a,n-1);
        int key=a[n-1];
        int j=n-2;
        while (j>=0&&a[j]>key){
            a[j+1]=a[j];
            j--;
        }
        a[j+1]=key;
    }
}
