package com.ssu.sergey_sidorov.java.lesson4.task4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

public class DynamicArray<T> implements Iterable<T> {
    private T[] array;
    private int size = 0;
    private int capacity = 0;

    public DynamicArray() {
        array = (T[]) (new Object[10]);
    }

    public DynamicArray(int size) {
        array = (T[]) (new Object[size]);
        capacity = size;
    }

    public void add(T el) {
        if (capacity == size) {
            Resize();
        }
        array[size] = el;
        size++;
    }


    public void remove(int index) {
        if (index < size){
            System.arraycopy(array, index + 1, array, index, array.length - 1 - index);
            size--;
        }
    }

    public T get(int index) {
        return (T) array[index];
    }

    public void set(T el, int index){
        if (index < capacity){
            if (size == capacity){
                Resize();
            }
            if (index == size){
                add(el);
            }
            else {
                System.arraycopy(array, index, array, index + 1, array.length - index - 1);
                array[index] = el;
            }
        }

    }

    public int getLength() {
        return array.length;
    }

    public void Resize() {
        T[] tempArray = (T[])(new Object[capacity * 2]);
        {
            if (capacity >= 0) {
                System.arraycopy(array, 0, tempArray, 0, capacity);
            }
        }
        array = tempArray;
        capacity = capacity * 2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int k = 0;
        for (T t : array) {
            if (t != null) {
                sb.append(t);
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    @Override
    public Iterator<T> iterator() {
        return Arrays.stream(array).iterator();
    }
}