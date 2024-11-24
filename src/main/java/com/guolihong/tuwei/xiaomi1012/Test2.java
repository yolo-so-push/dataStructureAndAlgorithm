package com.guolihong.tuwei.xiaomi1012;


import java.util.*;
// TODO 自定义双向链表
public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        int[] pre=new int[n+1];
        int[] next=new int[n+1];
        for (int i = 0; i <=n; i++) {
            pre[i]=i-1;
            next[i]=i+1;
        }
        pre[1]=0;
        next[n]=0;
        while (q-->0){
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            int op=scanner.nextInt();
            pre[next[a]]=pre[a];
            next[pre[a]]=next[a];
            if (op==0){
                next[a]=b;
                next[pre[b]]=a;
                pre[a]=pre[b];
                pre[b]=a;
            }else{
                pre[next[b]]=a;
                next[a]=next[b];
                next[b]=a;
                pre[a]=b;
            }
        }
        StringBuilder res=new StringBuilder();
        int cur=next[0];
        while (cur!=0){
            res.append(cur).append(" ");
            cur=next[cur];
        }
        System.out.println(res.toString().trim());
    }
}
