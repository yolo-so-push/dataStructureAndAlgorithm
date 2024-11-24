package com.guolihong.bytesDance;

import java.util.Scanner;

public class Test1 {
    //求二叉树中x,y的最近祖先
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int q=scanner.nextInt();
        while (q-->0){
            int x=scanner.nextInt();
            int y=scanner.nextInt();
            while (x!=y){
                if (x<y){
                    y=y/2;
                }else{
                    x=x/2;
                }
            }
            System.out.println(x);
        }
    }
}
