package com.guolihong.codeTop.day01;

import java.util.HashSet;
import java.util.Set;

public class Leetcode3 {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        char[] a = s.toCharArray();
        Set<Character> set=new HashSet<>();
        int max=0;
        for (int j = 0; j < s.length(); j++) {
            while (set.contains(a[j])){
                set.remove(a[i]);
                i++;
            }
            max=Math.max(j-i+1,max);
            set.add(a[j]);
        }
        return max;
    }
}
