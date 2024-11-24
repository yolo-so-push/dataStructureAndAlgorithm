package com.guolihong.zt;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Test1 {
    public int[] temperatures (int[] dailyTemperatures) {
        Deque<Integer> stack=new LinkedList<>();
        int[] res=new int[dailyTemperatures.length];
        stack.push(0);
        for (int i = 1; i < dailyTemperatures.length; i++) {
            while (!stack.isEmpty()&&dailyTemperatures[stack.peek()]<dailyTemperatures[i]){
                Integer pop = stack.pop();
                res[pop]=i-pop;
            }
            stack.push(i);
        }
        return res;
    }

    public static void main(String[] args) {
        Test1 test1=new Test1();
        int[] res = test1.temperatures(new int[]{1, 2, 3,1,1,1,2,4,5,9});
        System.out.println(Arrays.toString(res));
    }
}
