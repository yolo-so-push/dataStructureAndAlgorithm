package itheima.day02.codeTop;

import java.util.HashMap;
import java.util.Map;

public class LRU {

}
class LRUCache {

    class Node{
        int key;
        int val;
        Node pre;
        Node next;
        public Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }
    private Node head=new Node(-1,-1);
    private Node tail=new Node(-1,-1);
    private int capacity;
    private int size;
    private Map<Integer,Node> map=new HashMap<>();


    public LRUCache(int capacity) {
        this.capacity=capacity;
        this.size=0;
        this.head.next=this.tail;
        this.tail.pre=this.head;
    }

    public int get(int key) {
        if (!map.containsKey(key)){
            return -1;
        }
        Node node = map.get(key);
        remove(node);
        addToHead(node);
        return node.val;
    }

    private void addToHead(Node node) {
        Node next = this.head.next;
        node.next=next;
        next.pre=node;
        node.pre=this.head;
        this.head.next=node;
    }

    private void remove(Node node) {
        Node next = node.next;
        node.pre.next=next;
        next.pre=node.pre;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)){
            Node node = map.get(key);
            node.val=value;
            remove(node);
            addToHead(node);
        }else{
            Node node = new Node(key, value);
            addToHead(node);
            size++;
            map.put(key,node);
            if (size>capacity){
                Node last = this.tail.pre;
                remove(last);
                map.remove(last.key,last);
                size--;
            }
        }
    }
}