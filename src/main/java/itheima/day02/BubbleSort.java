package itheima.day02;

import java.util.Arrays;

/**
 * 递归实现冒泡排序
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] a=new int[]{2,4,2,9,3,5,0,2,1};
        BubbleSort bubbleSort=new BubbleSort();
        bubbleSort.recursion(a,a.length-1);
        System.out.println(Arrays.toString(a));
    }

    /**
     * 冒泡排序
     * @param a
     */
    private static void bubble(int[] a){
        for (int i = a.length-1; i>0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
    /**
     * 递归实现
     */
    private void recursion(int[] a,int idx){
        if (idx==0){
            return;
        }
        for (int j = 0; j < idx; j++) {
            if (a[j]>a[j+1]){
                int temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
        recursion(a,idx-1);
    }
}
