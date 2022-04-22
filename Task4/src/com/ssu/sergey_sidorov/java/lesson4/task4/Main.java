package com.ssu.sergey_sidorov.java.lesson4.task4;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Stream;

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
        arr.set(8, 3);
        System.out.println(arr);

        Random rand = new Random();
        int size = 1000000;
        List<Integer> lst = new ArrayList<>(10);

        for (int i = 0; i < 10; i++){
            lst.add(rand.nextInt(size));
        }

        Supplier<Stream> st = () -> lst.stream();

        List<Integer> evens = st.get().filter(x -> Integer.parseInt(x.toString())%2 == 0).toList();
        System.out.println(evens.toString());

        List<Integer> odds = st.get().filter(x -> Integer.parseInt(x.toString())%2 != 0).toList();
        System.out.println(odds.toString());

        List<Integer> doubleNum = st.get().map(x -> Integer.parseInt(x.toString()) * 2).toList();
        System.out.println(doubleNum.toString());

        List<Integer> setLst = st.get().distinct().toList();
        System.out.println(setLst.size());

        List<Integer> sortedLst = st.get().sorted(Comparator.reverseOrder()).toList();
        System.out.println(sortedLst.toString());

        Optional<Integer> sumLst = st.get().reduce((x,y) -> Integer.parseInt(x.toString()) + Integer.parseInt(y.toString()));
        System.out.println(sumLst.get());
    }
}
