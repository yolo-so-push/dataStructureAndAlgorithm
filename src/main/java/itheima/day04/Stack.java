package itheima.day04;

public interface Stack<E> {

    /**
     * 栈顶压入元素
     * @return
     */
    boolean push(E val);

    /**
     * 弹出栈顶元素
     * @return
     */
    E pop();

    /**
     * 获得栈顶元素
     * @return
     */
    E peek();

    /**
     * 判断栈是否为空
     * @return
     */
    boolean isEmpty();

    /**
     * 判断栈是否已满
     */
    boolean isFull();
}
