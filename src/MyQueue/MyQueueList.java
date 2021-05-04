package MyQueue;

import java.util.Arrays;

public class MyQueueList<E> implements InterMyQueue<E> {
    public static void main(String[] args) {
        MyQueueList<Integer> myQueueList = new MyQueueList<>();
        myQueueList.add(1);
        myQueueList.add(2);
        myQueueList.add(3);
        myQueueList.add(4);
        myQueueList.add(5);
        System.out.println(myQueueList.poll());
        System.out.println(myQueueList.peek());
        System.out.println(myQueueList.size);
        System.out.println(myQueueList);

    }

    private int size;
    private Object[] array;

    public MyQueueList() {
        size = 0;
        array = new Object[10];

    }

    @Override
    public void add(E element) {
        if (size == array.length) {
            Object[] newArray = new Object[array.length * 3 / 2 + 1];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        array[size++] = element;
    }

    @Override
    public void remove(int index) {
        Object[] newArray = new Object[array.length - 1];
        System.arraycopy(array, 0, newArray, 0, index);
        System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
        array = newArray;
        size--;
    }

    @Override
    public void clear() {
        Object[] newArray = new Object[array.length - 1];
        System.arraycopy(newArray, 0, array, 0, newArray.length);
        array = newArray;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E peek() {
        return (E) array[0];
    }

    @Override
    public E poll() {
        E array1 = peek();
        remove(0);
        return array1;

    }

    @Override
    public String toString() {
        Object[] newArray = new Object[size];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
        return Arrays.toString(array);
    }
}
