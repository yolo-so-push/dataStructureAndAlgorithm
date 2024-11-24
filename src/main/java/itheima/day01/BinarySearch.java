package itheima.day01;

public class BinarySearch {

    /**
     * 平衡版
     */
    public static int binarySearchBalance(int[] a,int tar){
        int i=0,j=a.length;
        while (j-i>1){
            int m=(i+j)>>1;
            if (a[m]<=tar){
                i=m;
            }else{
                j=m;
            }
        }
        return a[i]==tar?i : -1;
    }

    /**
     *java版本，返回插入-(位置+1)
     */
    public static int binarySearchJava(int[] a,int fromIdx,int toIdx,int tar){
        int i=fromIdx,j=toIdx-1;
        while (i<=j){
            int m=(i+j)>>1;
            if (a[m]==tar){
                return m;
            }else if(a[m]<tar){
                i=m+1;
            }else{
                j=m-1;
            }
        }
        return -(i+1);
    }

    /**
     * 返回最左边的目标元素下标
     */
    public static int binarySearchLeftMost(int[] a,int tar){
        int i=0,j=a.length-1;
        int can=-1;
        while (i<=j){
            int m=(i+j)>>1;
            if (a[m]==tar){
                can=m;
                j=m-1;
            }else if(a[m]<tar){
                i=m+1;
            }else{
                j=m-1;
            }
        }
        return can;
    }

    public static int binarySearchLeftMost2(int[] a,int tar){
        int i=0,j=a.length-1;
        while (i<=j){
            int m=(i+j)>>1;
            if (a[m]>=tar){
                j=m-1;
            }else{
                i=m+1;
            }
        }
        return i;
    }

    /**
     * 返回最边右的目标元素下标
     */
    public static int  binarySearchRightMost(int[] a,int tar){
        int i=0,j=a.length-1;
        int can=-1;
        while (i<=j){
            int m=(i+j)>>1;
            if (a[m]==tar){
                can=m;
                i=m+1;
            }else if(a[m]<tar){
                i=m+1;
            }else{
                j=m-1;
            }
        }
        return can;
    }


    public static int  binarySearchRightMost2(int[] a,int tar){
        int i=0,j=a.length-1;
        while (i<=j){
            int m=(i+j)>>1;
            if (a[m]<=tar){
                i=m+1;
            }else{
                j=m-1;
            }
        }
        return i-1;
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 4,4,4,6, 7, 8, 9};
        int res = BinarySearch.binarySearchRightMost2(a, 4);
        System.out.println(res);
    }
}
