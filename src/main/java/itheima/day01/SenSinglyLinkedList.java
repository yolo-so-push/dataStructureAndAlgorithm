package itheima.day01;

public class SenSinglyLinkedList {

    private Node sen=new Node(Integer.MIN_VALUE,null);
    private static class Node {
        int val;
        Node next;

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
    private Node getNodeByIdx(int idx){
        int i=0;
        Node cur=sen.next;
        while (i<idx&&cur!=null){
            cur=cur.next;
            i++;
        }
        if (i==idx){
            return cur;
        }else{
            return null;
        }
    }

    private Node findLast(){
        Node cur=sen;
        while (cur.next!=null){
            cur=cur.next;
        }
        return cur==sen?null:cur;
    }
}
