package itheima.day01;

public class Leetcode142 {
    public ListNode detectCycle(ListNode head) {
        if (head==null||head.next==null) return null;
        ListNode sen=new ListNode(-1,head);
        ListNode p1=sen,p2=sen;
        while (p2!=null&&p2.next!=null){
            p1=p1.next;
            p2=p2.next.next;
            if (p1==p2){
                break;
            }
        }
        p2=sen;
        while (p1!=null&&p1!=p2){
            p1=p1.next;
            p2=p2.next;
        }
        return p1;
    }
}
