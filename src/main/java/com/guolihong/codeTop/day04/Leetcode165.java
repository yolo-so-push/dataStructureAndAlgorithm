package com.guolihong.codeTop.day04;

public class Leetcode165 {
    public int compareVersion(String version1, String version2) {
        String[] split1 = version1.split("\\.");
        String[] split2= version2.split("\\.");
        for (int i = 0; i < split1.length||i<split2.length; i++) {
            int x=0,y=0;
            if (i<split1.length){
                x=Integer.parseInt(split1[i]);
            }
            if (i<split2.length){
                y=Integer.parseInt(split2[i]);
            }
            if (x<y){
                return -1;
            }
            if (x>y){
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Leetcode165 leetcode165=new Leetcode165();
        int res = leetcode165.compareVersion("1.0.0", "1.10");
        System.out.println(res);
    }
}
