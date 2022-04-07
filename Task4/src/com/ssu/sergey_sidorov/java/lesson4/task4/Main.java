package com.ssu.sergey_sidorov.java.lesson4.task4;

public class Main {

    public static void main(String[] args) {
        DynamicArray<Integer> arr = new DynamicArray<Integer>(2);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.println(arr);
        arr.remove(2);
        System.out.println(arr);
        System.out.println(arr.get(1));
        arr.set(8, 7);
        System.out.println(arr);
    }
}
