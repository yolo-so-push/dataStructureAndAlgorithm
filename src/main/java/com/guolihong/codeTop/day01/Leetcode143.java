package com.guolihong.codeTop.day01;

public class Leetcode143 {
    public void reorderList(ListNode head) {
        ListNode p1=head,p2=head;
        while (p2!=null&&p2.next!=null){
            p1=p1.next;
            p2=p2.next;
        }
        ListNode re=reverse(p1);
        ListNode l1=head,l2=re;
        while (l2!=null){
            ListNode next1 = l1.next;
            ListNode next2 = l2.next;
            l1.next=l2;
            l2.next=next1;
            l1=next1;
            l2=next2;
        }
    }

    private ListNode reverse(ListNode p1) {
        ListNode pre=null;
        ListNode cur=p1;
        while (cur!=null){
            ListNode next = cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        return pre;
    }

    public static void main(String[] args) {
        Leetcode143 leetcode143=new Leetcode143();
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        leetcode143.reorderList(listNode);
    }
}
