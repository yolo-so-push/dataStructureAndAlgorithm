package com.guolihong.codeTop.day05;

import com.guolihong.codeTop.day01.ListNode;

public class LeetcodeLCR140 {
    public ListNode trainingPlan(ListNode head, int cnt) {
        ListNode sen=new ListNode(-1,head);
        ListNode p1=sen,p2=sen;
        for (int i = 0; i < cnt; i++) {
            p2=p2.next;
        }
        while (p2!=null){
            p1=p1.next;
            p2=p2.next;
        }
        return p1;
    }
}
