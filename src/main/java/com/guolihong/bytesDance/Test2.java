package com.guolihong.bytesDance;

import java.util.*;

public class Test2 {
    //请将m个数字进行拆分和并为2^n次方最少需要进行几次操作，拆分和并规则为：可以将数字x拆分为1和x-1,合并只能合并两个相同的数字。
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();//碎片
        int m=scanner.nextInt();//碎片个数
        Deque<Integer> set=new LinkedList<>();
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < m; i++) {
            int a=scanner.nextInt();
            map.put(a,map.getOrDefault(a,0)+1);
            set.addFirst(a);
        }
        int count=0;
        while (map.size()>0){
            set=new LinkedList<>(map.keySet());
            if (map.containsKey((int)Math.pow(2,n))){
                break;
            }
            Integer poll = set.pollLast();
            if (poll>n&&poll%n!=0&&(poll/n)%2!=0){
                count+=poll-n;
                map.put(poll,map.get(poll)-1);
                map.put(n,map.getOrDefault(n,0)+1);
            }else{
                while (map.get(poll)>=2){
                    count++;
                    map.put(poll,map.get(poll)-2);
                    map.put(poll*2,map.getOrDefault(poll*2,0)+1);
                }
            }
        }
        System.out.println(count);
    }
}
