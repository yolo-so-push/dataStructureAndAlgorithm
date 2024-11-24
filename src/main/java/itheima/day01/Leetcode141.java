package itheima.day01;

public class Leetcode141 {
    public boolean hasCycle(ListNode head) {
        ListNode p1=head,p2=head;
        while (p2!=null&&p2.next!=null){
            p1=p1.next;
            p2=p2.next.next;
            if (p2!=null&&p1.val==p2.val){
                return true;
            }
        }
        return false;
    }
}
