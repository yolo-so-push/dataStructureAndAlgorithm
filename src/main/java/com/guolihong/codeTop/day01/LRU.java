package com.guolihong.codeTop.day01;

import java.util.HashMap;
import java.util.Map;

public class LRU {
    public static void main(String[] args) {
        LRUCache lruCache=new LRUCache(5);
        lruCache.put(1,1);
        lruCache.put(2,2);
        int i = lruCache.get(1);
        lruCache.put(3,3);
        lruCache.put(4,4);
        int i1 = lruCache.get(4);
        lruCache.put(5,5);
        lruCache.put(6,6);
    }
}
class LRUCache {

    class Node{
        int key;
        int val;
        Node pre;
        Node next;

        public Node() {
        }

        public Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }
    private int size;
    private int capacity;
    private Node head=new Node();
    private Node tail=new Node();
    private Map<Integer,Node>  cacheMap=new HashMap<>();
    public LRUCache(int capacity) {
        this.capacity=capacity;
        this.size=0;
        this.head.next=tail;
        this.tail.pre=head;
    }

    public int get(int key) {
        if (!cacheMap.containsKey(key)){
            return -1;
        }
        Node node = cacheMap.get(key);
        moveToHead(node);
        return node.val;
    }

    private void moveToHead(Node node) {
        removeNode(node);
        addToHead(node);
    }

    private void addToHead(Node node) {
        Node next = this.head.next;
        node.next=next;
        node.pre=this.head;
        this.head.next=node;
        next.pre=node;
    }

    private void removeNode(Node node) {
        Node next = node.next;
        Node pre = node.pre;
        pre.next=next;
        next.pre=pre;
    }

    public void put(int key, int value) {
        if (cacheMap.containsKey(key)){
            Node node = cacheMap.get(key);
            node.val=value;
            cacheMap.put(key,node);
            moveToHead(node);
        }else{
            size++;
            Node node = new Node(key, value);
            cacheMap.put(key,node);
            addToHead(node);
            if (size>capacity){
                Node last = this.tail.pre;
                removeNode(last);
                cacheMap.remove(last.key);
                size--;
            }
        }
    }
}