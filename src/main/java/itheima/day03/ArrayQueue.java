package itheima.day03;

import java.util.Iterator;

public class ArrayQueue<E> implements Queue<E>,Iterable{

    private final int len;
    private final E[] array;
    private int head;
    private int tail;

    @SuppressWarnings("all")
    public ArrayQueue(int capacity){
        len=capacity+1;
        array= (E[]) new Object[len];
    }
    @Override
    public boolean offer(E value) {
        if (isFull()){
            return false;
        }
        array[tail]=value;
        tail=(tail+1)%len;
        return false;
    }

    @Override
    public E poll() {
        if (isEmpty()){
            return null;
        }
        E e = array[head];
        head=(head+1)%len;
        return e;
    }

    @Override
    public E peek() {
        if (isEmpty()){
            return null;
        }
        E e = array[head];
        return e;
    }

    @Override
    public boolean isEmpty() {
        return head==tail;
    }

    @Override
    public boolean isFull() {
        return (tail+1)%len==head;
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {
            int p=head;
            @Override
            public boolean hasNext() {
                return p!=tail;
            }

            @Override
            public Object next() {
                E e = array[p];
                p=(p+1)%len;
                return e;
            }
        };
    }
}
