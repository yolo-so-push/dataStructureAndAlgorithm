package itheima.day01;

public class Leetcode234 {
    public boolean isPalindrome(ListNode head) {
        ListNode p1=head,p2=head;
        while (p2!=null&&p2.next!=null){
            p1=p1.next;
            p2=p2.next.next;
        }
        ListNode pre=null;
        ListNode cur=p1;
        while (cur!=null){
            ListNode next = cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        ListNode p=head;
        while (pre!=null){
            if (pre.val!=p.val){
                return false;
            }
            pre=pre.next;
            p=p.next;
        }
        return true;
    }
}
