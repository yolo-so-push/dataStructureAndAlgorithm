package itheima.day01;

public class Leetcode83 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head==null||head.next==null){
            return head;
        }
        ListNode sen=new ListNode(-1,head);
        ListNode p1=head,p2=head.next;
        while (p2!=null){
            while (p1.val==p2.val){
                p2=p2.next;
            }
            p1.next=p2;
            p2=p2.next;
            p1=p1.next;
        }
        return sen.next;
    }
}
