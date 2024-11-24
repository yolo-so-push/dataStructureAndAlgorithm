package com.guolihong.codeTop.day03;

import com.guolihong.codeTop.day01.ListNode;

public class Leetcode82 {

    public ListNode deleteDuplicates(ListNode head) {
        if (head==null||head.next==null) return head;
        if (head.val==head.next.val){
            ListNode x=head.next.next;
            while (x!=null&&x.val==head.val){
                x=x.next;
            }
            return deleteDuplicates(x);
        }else{
            head.next=deleteDuplicates(head.next);
            return head;
        }
    }
}
