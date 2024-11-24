package itheima.day02;

/**
 * 递归实现二分查找
 */
public class BinarySearch {
    public static void main(String[] args) {
        int res = recursion(new int[]{1, 2, 3, 4, 5, 6, 7}, 0, 6, 3);
        System.out.println(res);
    }
    private static int recursion(int[] a,int i,int j,int tar){
        if (i>j){
            return -1;
        }
        int m=(i+j)>>1;
        if (tar<a[m]){
            return recursion(a,i,m-1,tar);
        }else if(a[m]<tar){
            return recursion(a,m+1,j,tar);
        }else{
            return m;
        }
    }
}
