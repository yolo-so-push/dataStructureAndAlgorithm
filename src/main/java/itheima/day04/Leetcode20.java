package itheima.day04;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;

public class Leetcode20 {
    public boolean isValid(String s) {
        char[] a = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        Map<Character,Character> map=new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');
        for (char c : a) {
            switch (c) {
                case '[', '(', '{' -> stack.push(c);
                default -> {
                    if (!stack.isEmpty()) {
                        Character pop = stack.pop();
                        if (map.get(pop) != c) {
                            return false;
                        }
                    } else {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Leetcode20 leetcode20=new Leetcode20();
        boolean res = leetcode20.isValid("([}])");
        System.out.println(res);
    }
}
