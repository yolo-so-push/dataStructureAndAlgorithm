package com.guolihong.codeTop.day05;

import java.util.Deque;
import java.util.LinkedList;

public class Leetcode155 {

}
class MinStack {
    Deque<Integer> minStack=new LinkedList<>();
    Deque<Integer> stack=new LinkedList<>();
    public MinStack() {
        minStack.push(Integer.MAX_VALUE);
    }

    public void push(int val) {
        minStack.push(Math.min(minStack.peek(),val));
        stack.push(val);
    }

    public void pop() {
        minStack.pop();
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
