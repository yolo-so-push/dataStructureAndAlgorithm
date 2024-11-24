package com.guolihong.codeTop.day04;

public class Leetcode8 {
    public int myAtoi(String s) {
        s=s.trim();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >='0' && c <='9'){
                stringBuilder.append(c);
            }
            if (c=='-'&&stringBuilder.length()==0){
                stringBuilder.append(c);
            }else if (c<'0'||c>'9'){
                break;
            }
        }
        if (stringBuilder.length()>1){
            if (stringBuilder.toString().startsWith("0")){
                stringBuilder.deleteCharAt(0);
            }
        }
        if (stringBuilder.length()==0){
            return 0;
        }
        if (Long.parseLong(stringBuilder.toString())<Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        if (Long.parseLong(stringBuilder.toString())>Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
       return Integer.parseInt(stringBuilder.toString());
    }

    public static void main(String[] args) {
        Leetcode8 leetcode8=new Leetcode8();
        int res = leetcode8.myAtoi("0-1");
        System.out.println(res);
    }
}
