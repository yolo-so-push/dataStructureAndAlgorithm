package itheima.day04;

import java.util.Stack;

public class LeetcodeLCR036 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for (String token : tokens) {
            switch (token){
                case "+":
                    Integer pop1 = stack.pop();
                    Integer pop2 = stack.pop();
                    int sum = pop1 + pop2;
                    stack.push(sum);
                    break;
                case "-":
                    pop1 = stack.pop();
                    pop2 = stack.pop();
                    sum = pop2 - pop1;
                    stack.push(sum);
                    break;
                case "*":
                    pop1 = stack.pop();
                    pop2 = stack.pop();
                    sum = pop1 *pop2;
                    stack.push(sum);
                    break;
                case "/":
                    pop1 = stack.pop();
                    pop2 = stack.pop();
                    sum = pop2/pop1;
                    stack.push(sum);
                    break;
                default:
                    stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}
