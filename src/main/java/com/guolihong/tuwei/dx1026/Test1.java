package com.guolihong.tuwei.dx1026;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int res=0;
        for (int i = 7; i <=n; i++) {
            String s = String.valueOf(i);
            if (s.startsWith("7")&&s.endsWith("7")){
                res++;
            }
        }
        System.out.println(res);
    }
}
