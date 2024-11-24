package com.guolihong.codeTop.day01;

public class Leetcode25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode p=head;
        int cnt=0;
        while (p!=null){
            cnt++;
            p=p.next;
        }
        ListNode sen=new ListNode(-1,head);
        ListNode s1=sen;
        ListNode cur=head,pre=null;
        for (int i = 0; i < cnt-k+1; i+=k) {
            for (int j = 0; j < k; j++) {
                ListNode next = cur.next;
                cur.next=pre;
                pre=cur;
                cur=next;
            }
            ListNode next = s1.next;
            next.next=cur;
            s1.next=pre;
            s1=next;
        }
        return sen.next;
    }
}
