package itheima.day01;

public class Leetcode876 {
    public ListNode middleNode(ListNode head) {
        ListNode p1=head,p2=head;
        while (p2!=null&&p2.next!=null){
            p1=p1.next;
            p2=p2.next.next;
        }
        return p1;
    }
}
