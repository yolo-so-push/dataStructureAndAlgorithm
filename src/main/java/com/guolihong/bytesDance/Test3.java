package com.guolihong.bytesDance;

import java.util.*;

public class Test3 {
    public static void main(String[] args) {
        //a,b,c l~r bl=br&&cl~cr al+al+1+....+ar
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        int[] c=new int[n];
        long[] sum=new long[n];
        Map<Integer, List<Integer>> map=new HashMap<>();
        for (int i = 0; i < n; i++) {
            a[i]=scanner.nextInt();
            sum[i]=a[i];
            if (i>0) sum[i]+=sum[i-1];
        }
        for (int i = 0; i < n; i++) {
            b[i]=scanner.nextInt();
            if (map.containsKey(b[i])){
                List<Integer> list = map.get(b[i]);
                list.add(i);
                map.put(b[i],list);
            }else{
                List<Integer> list=new LinkedList<>();
                list.add(i);
                map.put(b[i],list);
            }
        }
        for (int i = 0; i < n; i++) {
            c[i]=scanner.nextInt();
        }
        long res=0;
        for (int i = 1; i < n; i++) {
            if (map.get(b[i]).size()<2) break;
            List<Integer> list = map.get(b[i]);
            for (int j = 0; j < list.size(); j++) {
                for (int k = 0; k < j; k++) {
                    Integer l = list.get(j);
                    Integer r = list.get(k);
                    if (b[l]==b[r]&&c[l]!=c[r]){
                        res+=sum[r]-sum[l]+a[l];
                        res%=1000000007;
                    }
                }
            }

        }
        System.out.println(res);
    }
}
