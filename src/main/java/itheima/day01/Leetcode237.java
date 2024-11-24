package itheima.day01;

public class Leetcode237 {
    public void deleteNode(ListNode node) {
        if (node.next==null){
            node=null;
        }else{
            node.val=node.next.val;
            node.next=node.next.next;
        }
    }
}
