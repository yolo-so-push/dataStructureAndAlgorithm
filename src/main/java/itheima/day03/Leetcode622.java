package itheima.day03;

public class Leetcode622 {

}
class MyCircularQueue {

    private static class Node{
        private int value;
        private Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    private int size=0;
    private int capacity=0;
    private Node sen=new Node(-1,null);
    private Node head=sen;
    private Node tail=head;
    public MyCircularQueue(int k) {
        this.capacity=k;
    }
    {
        tail.next=head;
    }
    public boolean enQueue(int value) {
        if (isFull()){
            return false;
        }
        Node added=new Node(value,head);
        tail.next=added;
        tail=added;
        size++;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()){
            return false;
        }
        Node first = head.next;
        head.next=first.next;
        if (first==tail){
            tail=head;
        }
        size--;
        return true;
    }


    public int Front() {
        if (isEmpty()) return -1;
        Node front = head.next;
        return front.value;
    }

    public int Rear() {
        if (isEmpty()) return -1;
        return tail.value;
    }

    public boolean isEmpty() {
        return head==tail;
    }

    public boolean isFull() {
        return size==capacity;
    }
}
