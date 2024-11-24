package com.guolihong.codeTop.day04;

import java.util.Stack;

public class Leetcode232 {

}
class MyQueue {
    Stack<Integer> stack1=new Stack<>();
    Stack<Integer> stack2=new Stack<>();
    int size;

    public MyQueue() {
        this.size=0;
    }

    public void push(int x) {
        while (!stack2.isEmpty()){
            Integer pop = stack2.pop();
            stack1.push(pop);
        }
        stack1.push(x);
        size++;
    }

    public int pop() {
        if (size==0){
            return -1;
        }
        while (!stack1.isEmpty()){
            Integer pop = stack1.pop();
            stack2.push(pop);
        }
        Integer pop = stack2.pop();
        size--;
        return pop;
    }

    public int peek() {
        if (size==0){
            return -1;
        }
        while (!stack1.isEmpty()){
            Integer pop = stack1.pop();
            stack2.push(pop);
        }
        return stack2.peek();
    }

    public boolean empty() {
        return size==0;
    }
}