package com.ssu.sergey_sidorov.java.lesson5.task5;

import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        FileFind fileFind = new FileFind("E:\\VIDOSI");

        List result = fileFind.findByFileName("хряк пугает Игоря.mp4");
        result.forEach(x -> System.out.println(x));
        System.out.println();

        fileFind.findMaxS();
        System.out.println();

        fileFind.findMaxSizeFiles();
        System.out.println();

        System.out.println("Size directory: " + fileFind.getFolderSize() + " mb");
        System.out.println();

        fileFind.getCountFilesByFirstChars("E:\\VIDOSI");
    }
}
