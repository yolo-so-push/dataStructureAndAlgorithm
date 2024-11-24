package itheima.day01;

import com.guolihong.codeTop.day01.ListNode;

public class Leetcode203 {

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode removeElements(ListNode head, int val) {
        ListNode sen=new ListNode(-1,head);
        ListNode p1=sen,p2=head;
        while(p2!=null){
            if(p2.val==val){
                p1.next=p2.next;
            }else{
                p1=p1.next;
            }
            p2=p2.next;
        }
        return sen.next;
    }

    public static void main(String[] args) {
        Leetcode203 leetcode203=new Leetcode203();
        ListNode head=new ListNode(1,new ListNode(2,new ListNode(6,new ListNode(3,new ListNode(4,new ListNode(5,new ListNode(6,null)))))));
        ListNode res = leetcode203.removeElements(head, 6);
        System.out.println(res);
    }
}
