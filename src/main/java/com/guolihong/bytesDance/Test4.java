package com.guolihong.bytesDance;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        //求不存在>1的奇数回文子字符串的字符串
        Scanner scanner=new Scanner(System.in);
        int T=scanner.nextInt();
        while (T-->0){
            int n=scanner.nextInt();//0
            int m=scanner.nextInt();//1
            if (n==1&&m==1){
                System.out.println("01");
                break;
            }
            if (n%2!=0&&m%2!=0){
                System.out.println(-1);
            }else if (Math.abs(n-m)>2){
                System.out.println(-1);
            }else{
                StringBuilder stringBuilder=new StringBuilder();
                if (n%2!=0){
                    stringBuilder.append("0");
                    n--;
                    while (n>=2&&m>=2){
                        stringBuilder.append("1100");
                        n-=2;
                        m-=2;
                    }
                    while (n>0){
                        stringBuilder.append("0");
                        n--;
                    }
                    while (m>0){
                        stringBuilder.append("1");
                        m--;
                    }
                }else{
                    stringBuilder.append("1");
                    m--;
                    while (n>=2&&m>=2){
                        stringBuilder.append("0011");
                        n-=2;
                        m-=2;
                    }
                    while (n>0){
                        stringBuilder.append("0");
                        n--;
                    }
                    while (m>0){
                        stringBuilder.append("1");
                        m--;
                    }
                }

                System.out.println(stringBuilder.toString());
            }
        }
    }
}
