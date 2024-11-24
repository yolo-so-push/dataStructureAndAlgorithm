package itheima.day04;

import java.util.Iterator;

public class LinkedListStack<E> implements Stack<E>,Iterable<E>{

    private final int capacity;

    private int size;
    private final Node<E> head=new Node<>(null,null);

    public LinkedListStack(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            Node<E> p=head.next;
            @Override
            public boolean hasNext() {
                return p!=null;
            }

            @Override
            public E next() {
                E value = p.value;
                p=p.next;
                return value;
            }
        };
    }

    private static class Node<E>{
        E value;
        Node<E> next;

        public Node(E value, Node<E> next) {
            this.value = value;
            this.next = next;
        }
    }

    @Override
    public boolean push(E val) {
        if (isFull()){
            return false;
        }
        Node<E> next = head.next;
        head.next=new Node<>(val,next);
        size++;
        return true;
    }

    @Override
    public E pop() {
        if (isEmpty()){
            return null;
        }
        Node<E> first = head.next;
        head.next=first.next;
        size--;
        return first.value;
    }

    @Override
    public E peek() {
        if (isEmpty()){
            return null;
        }
        Node<E> first = head.next;
        return first.value;
    }

    @Override
    public boolean isEmpty() {
        return head.next==null;
    }

    @Override
    public boolean isFull() {
        return size==capacity;
    }


}
