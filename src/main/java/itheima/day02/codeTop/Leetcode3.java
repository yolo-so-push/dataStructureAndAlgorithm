package itheima.day02.codeTop;

import java.util.HashSet;
import java.util.Set;

public class Leetcode3 {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<>();
        int res=0;
        char[] a = s.toCharArray();
        int i=0,j=0;
        while (j<a.length){
            while (set.contains(a[j])){
                set.remove(a[i]);
                i++;
            }
            set.add(a[j]);
            res=Math.max(res,j-i+1);
            j++;
        }
        return res;
    }
}
