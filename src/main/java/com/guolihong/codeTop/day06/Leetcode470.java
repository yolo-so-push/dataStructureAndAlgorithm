package com.guolihong.codeTop.day06;

import java.util.Random;

public class Leetcode470 {
    public int rand10() {
        int re = (int) ((double)rand7()/7*10);
        return re;
    }

    public int rand7(){
        int res = (int) new Random().nextInt(7) + 1;
        return res;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            Leetcode470 leetcode470 = new Leetcode470();
            int re = leetcode470.rand10();
            System.out.print(re+" ");
        }
    }
}
