package com.guolihong.tuwei.dx1026;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] split = scanner.nextLine().split(" ");
        int x=scanner.nextInt();
        int k=scanner.nextInt();
        int[] a=new int[split.length+1];
        List<Integer> list=new LinkedList<>();
        int res=0;
        for (int i = 1; i <=split.length; i++) {
            a[i]=Integer.parseInt(split[i-1]);
            if (a[i]%x==0){
                list.add(i);
            }
        }
        if (list.size()<k){
            System.out.println(0);
        }else{
            Integer right = list.get(k);
            Integer left = list.get(0);
            int il=0,ir=k;
            int l=1,r=list.get(k-1);
            while (true){
                while (l<=left){
                    res++;
                    l++;
                }
                while (r<=right){
                    res++;
                    r++;
                }
                il++;
                ir++;
                if (ir>=list.size()) break;
                left=list.get(il);
                right= list.get(ir);
            }
        }
        System.out.println(res);
    }
}
