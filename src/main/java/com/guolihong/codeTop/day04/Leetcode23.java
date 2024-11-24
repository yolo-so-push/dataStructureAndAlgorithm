package com.guolihong.codeTop.day04;

import com.guolihong.codeTop.day01.ListNode;

public class Leetcode23 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length==0){
            return null;
        }
        if (lists.length==1){
            return lists[0];
        }
        return split(lists,0,lists.length-1);
    }

    private ListNode split(ListNode[] lists, int i, int j) {
        if (i==j){
            return lists[i];
        }
        int m=(i+j)>>1;
        ListNode left = split(lists, i, m);
        ListNode right = split(lists, m + 1, j);
        return mergeLists(left,right);
    }

    private ListNode mergeLists(ListNode left, ListNode right) {
        ListNode sen=new ListNode(-1);
        ListNode p=sen;
        while (left!=null&&right!=null){
            if (left.val< right.val){
                p.next=left;
                left=left.next;
            }else{
                p.next=right;
                right=right.next;
            }
            p=p.next;
        }
        if (left!=null){
            p.next=left;
        }
        if (right!=null){
            p.next=right;
        }
        return sen.next;
    }

}
