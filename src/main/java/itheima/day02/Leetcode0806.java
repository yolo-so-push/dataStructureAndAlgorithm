package itheima.day02;

import javax.swing.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Leetcode0806 {

    public static void main(String[] args) {
        Leetcode0806 leetcode0806=new Leetcode0806();
        List<Integer> A = new LinkedList<>();
        A.add(4);
        A.add(3);
        A.add(2);
        A.add(1);
        List<Integer> B = new LinkedList<>();
        List<Integer> C = new LinkedList<>();
        leetcode0806.hanota(A,B,C);
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
    }
    public void hanota(List<Integer> A, List<Integer> B, List<Integer> C) {
        move(A,B,C,A.size());
    }

    private void move(List<Integer> a, List<Integer> b, List<Integer> c, int n) {
        if (n==0){
            return;
        }
        move(a,c,b,n-1);
        c.add(a.remove(a.size()-1));
        move(b,a,c,n-1);
    }
}
