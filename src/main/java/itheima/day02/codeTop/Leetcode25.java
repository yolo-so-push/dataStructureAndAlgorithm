package itheima.day02.codeTop;


public class Leetcode25 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode p=head;
        int count=0;
        while (p!=null){
            count++;
            p=p.next;
        }
        ListNode sen=new ListNode(-1,head);
        ListNode p1=sen;
        ListNode pre=null,cur=head;
        for (int i = 0; i <count-k; i+=k) {
            for (int j = 0; j < k; j++) {
                ListNode next = cur.next;
                cur.next=pre;
                pre=cur;
                cur=next;
            }
            ListNode next = p1.next;
            next.next=cur;
            p1.next=pre;
            p1=next;
        }
        return sen.next;
    }
}
