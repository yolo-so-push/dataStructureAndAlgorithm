package itheima.day03;

import java.util.Iterator;

public class LinkedListQueue<E>
        implements Queue<E>, Iterable<E> {
    private static class Node<E>{
        E value;
        Node<E> next;

        public Node(E value, Node<E> next) {
            this.value = value;
            this.next = next;
        }
    }
    private Node<E> sen=new Node<>(null,null);
    private Node<E> head=sen;
    private Node<E> tail=head;
    private int size=0;
    private int capacity=Integer.MAX_VALUE;

    {
        tail.next=head;
    }

    public LinkedListQueue() {
    }

    public LinkedListQueue(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public boolean offer(E value) {
        if (isFull()){
            return false;
        }
        Node added=new Node(value,head);
        tail.next=added;
        tail=added;
        size++;
        return true;
    }

    @Override
    public E poll() {
        if (isEmpty()){
            return null;
        }
        Node<E> poll = head.next;
        head.next=poll.next;
        //只有一个元素
        if (poll==tail){
            tail=head;
        }
        size--;
        return poll.value;
    }

    @Override
    public E peek() {
        if (isEmpty()){
            return null;
        }
        Node<E> peek = head.next;
        return peek.value;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public boolean isFull() {
        return size==capacity;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            Node<E> p=head.next;
            @Override
            public boolean hasNext() {
                return p!=head;
            }

            @Override
            public E next() {
                E value = p.value;
                p=p.next;
                return value;
            }
        };
    }
}