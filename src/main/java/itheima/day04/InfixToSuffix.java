package itheima.day04;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 中缀表达式转后缀
 */
public class InfixToSuffix {

    public static void main(String[] args) {
        String s = toSuffix("1+2");
        String[] split1 = s.split("");
        System.out.println(evalRPN(split1));
        System.out.println();
        System.out.println(toSuffix("1+2-3"));
        System.out.println(toSuffix("1+2*3"));
        System.out.println(toSuffix("1*2-3"));
        System.out.println(toSuffix("(1+2)*3"));
        String s1 = toSuffix("1+2*3+(4*5+6)*7");
        String[] split = s1.split("");
        System.out.println(evalRPN(split));

    }

    private static String toSuffix(String s) {
        char[] a = s.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        map.put('+',1);
        map.put('-',1);
        map.put('*',2);
        map.put('/',3);
        Stack<Character> stack=new Stack<>();
        StringBuilder res=new StringBuilder();
        for (char c : a) {
            switch (c){
                case '+','-','*','/':
                    while (!stack.isEmpty()&&stack.peek()!='('&&map.get(c)<=map.get(stack.peek())){
                        Character pop = stack.pop();
                        res.append(pop);
                    }
                    stack.push(c);
                    break;
                case '(':
                    stack.push(c);
                    break;
                case ')':
                    while (stack.peek()!='('){
                        Character pop = stack.pop();
                        res.append(pop);
                    }
                    stack.pop();
                    break;
                default:
                    res.append(c);
            }
        }
        while (!stack.isEmpty()){
            res.append(stack.pop());
        }
        return res.toString();
    }

    public static int evalRPN(String[] tokens) {
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
