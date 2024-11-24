package com.guolihong.pdd;

import java.util.Scanner;

public class bigMutil {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s1=scanner.next();
        String s2=scanner.next();
        String res = multiply(s1, s2);
        System.out.println(res);
    }
    public static String multiply(String num1, String num2) {
        int n1=num1.length();
        int n2=num2.length();
        int[] res=new int[n1+n2];
        for (int i = n1-1; i >=0; i--) {
            for (int j = n2-1; j>=0 ; j--) {
                res[i+j+1]+=(num1.charAt(i)-'0')*(num2.charAt(j)-'0');
            }
        }
        for (int i = res.length-1; i>0; i--) {
            if (res[i]>=10){
                res[i-1]+=res[i]/10;
                res[i]=res[i]%10;
            }
        }
        StringBuilder sb=new StringBuilder();
        for (int re : res) {
            if (!(sb.length()==0&&re==0)){
                sb.append(re);
            }
        }
        return sb.length()==0?"0":sb.toString();
    }


}

