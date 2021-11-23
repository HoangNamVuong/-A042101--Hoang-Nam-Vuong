package lesson10_arrayList_and_linkedList.practice.implement_class_list_simple;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private Object[] elements;
    private static final int DEFAULT_CAPACITY = 10;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + " , size " + i);
        }
        return (E) elements[i];
    }

}
