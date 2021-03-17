package effectiveJava.clearExpiredObjectImport;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * @ClassName Stack  对象回收相关问题
 * @Author licongcong
 * @Date 2021/3/16 11:17
 * @Version 1.0
 **/
public class StackDemo {

    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public StackDemo() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public Object pop() {
        if (size == 0){
            throw new EmptyStackException();
        }
        return elements[--size];
    }

    //此种实现消除对应应用
    public Object pop2() {
        if (0 == size) {
            throw new EmptyStackException();
        }
        Object result = elements[--size];
        //消除过期对象引用
        elements[size] = null;
        return result;
    }

    /**
     * Ensure space for at least one more element, roughly
     * doubling the capacity each time the array needs to grow.
     */
    private void ensureCapacity() {
        if (elements.length == size){
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }

    public static void main(String[] args) {
        StackDemo stack = new StackDemo();

        stack.push("1");

        stack.push("2");

        //当调用pop()方法时，size变为1，但是elements数组中还存在过期对象“1”的引用
        stack.pop();
        stack.pop2();

        stack.push("3");

    }

}
