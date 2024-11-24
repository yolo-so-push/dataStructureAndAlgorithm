package itheima.day01;

import org.w3c.dom.Node;

import java.util.Iterator;

public class SinglyLinkedList implements Iterable {

    private Node head;


    private static class Node {
        int val;
        Node next;

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    /**
     * 添加到头节点
     *
     * @param val
     */
    public void addFirst(int val) {
        this.head = new Node(val, this.head);
    }

    /**
     * while循环遍历
     */
    public void loopByWhile() {
        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
    }

    /**
     * for循环遍历
     */
    public void loopByFor() {
        Node cur = this.head;
        for (; cur != null; cur = cur.next) {
            System.out.print(cur.val + " ");
        }
    }

    /**
     * 迭代器遍历
     */
    @Override
    public Iterator iterator() {
        return new NodeIterator();
    }

    private class NodeIterator implements Iterator<Integer> {
        SinglyLinkedList.Node cur = head;

        @Override
        public boolean hasNext() {
            return cur != null;
        }

        @Override
        public Integer next() {
            int val = cur.val;
            cur = cur.next;
            return val;
        }
    }

    /**
     * 递归遍历
     */
    public void loopByRecursion(Node cur) {
        if (cur == null) {
            return;
        }
        System.out.print(cur.val);
        loopByRecursion(cur.next);
    }

    /**
     * 查找最后一个元素
     */
    public Node findLast(){
        Node cur=head;
        if (cur==null){
            return null;
        }
        while (cur.next!=null){
            cur=cur.next;
        }
        return cur;
    }
    /**
     * 尾部添加
     */
    public void addLast(int val) {
        Node last = findLast();
        if (last==null){
            last=new Node(val,null);
            return;
        }
        last.next=new Node(val,null);
    }


    public void addLast(int first, int... rest) {
        Node subList = new Node(first, null);
        Node cur = subList;
        for (int val : rest) {
            cur.next = new Node(val, null);
            cur = cur.next;
        }
        Node last = findLast();
        if (last==null){
            last=subList;
            return;
        }
        last.next=subList;
    }

    /**
     * 根据索引获取
     */
    public Node findByIdx(int idx){
        int i=0;
        Node cur=head;
        while (i!=idx&&cur!=null){
            cur=cur.next;
            i++;
        }
        if (i==idx){
            return cur;
        }else{
            return null;
        }
    }
}
