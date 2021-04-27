package MyArrayList;

import java.util.Arrays;

class Main extends MyArrayList1 {
    public static <T> void main(String[] args) {
        MyArrayList1<Integer> temp = new MyArrayList1<>();
        temp.add(1); //0
        temp.add(2); //0
        temp.add(3); //0
        temp.add(4); //0
        //temp.clear();
        System.out.println(temp);
        System.out.println(temp.size());
        System.out.println(temp.get(2));
    }
}
public class MyArrayList1<T> implements MyList1 {
    private int size;
    private Object[] array;
    public MyArrayList1() {

        array = new Object[10];
    }
    public MyArrayList1(Object[] array) {
    }
    @Override
    public void add(Object element) {
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
        size = 0;
    }
    @Override
    public int size() {
        return size;
    }
    @Override
    public T get(int index) {
        return (T) array[index];
    }

    @Override
    public String toString() {
        //Object[] newArray1 = new Object[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                System.arraycopy(array, 0, array, 0, size);
                array = array;
                return Arrays.toString(array);
            }
        }
        return Arrays.toString(array);
    }
// @Override
    //public String toString() {
//        Object[] newArray1 = new Object[size];
//        System.arraycopy(array, 0, newArray1, 0, size);
//        array = newArray1;
//        return Arrays.toString(array);
//    }
}

