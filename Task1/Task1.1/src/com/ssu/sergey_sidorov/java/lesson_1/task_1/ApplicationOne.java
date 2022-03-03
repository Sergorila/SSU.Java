package com.ssu.sergey_sidorov.java.lesson_1.task_1;
//Sergey, task 1, variant 3
public class ApplicationOne {

    public static void main(String[] args) {
        ApplicationOne app = new ApplicationOne();
        app.startApplication();
    }

    private void startApplication() {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++){
            arr[i] = (int) (Math.random() * (20+1)) - 10;
        }

        negToZero(arr);

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

    }

    private void negToZero(int[] arr){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 0){
                arr[i] = 0;
            }
        }
    }
}
