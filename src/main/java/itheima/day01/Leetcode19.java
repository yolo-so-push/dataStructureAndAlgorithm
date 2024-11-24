package itheima.day01;

public class Leetcode19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode sen=new ListNode(-1,head);
        ListNode p1=sen,p2=sen;
        while (n-->0){
            p2=p2.next;
        }
        while (p2.next!=null){
            p1=p1.next;
            p2=p2.next;
        }
        p1.next=p1.next.next;
        return sen.next;
    }
}
