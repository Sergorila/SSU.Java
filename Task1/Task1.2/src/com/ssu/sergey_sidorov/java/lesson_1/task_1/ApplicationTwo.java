package com.ssu.sergey_sidorov.java.lesson_1.task_1;

import java.util.Scanner;

public class ApplicationTwo {

    public static void main(String[] args) {
        ApplicationTwo app = new ApplicationTwo();
        app.startApplication();
    }

    public void startApplication() {
        Scanner input = new Scanner(System.in);
        int A, B;
        System.out.println("Enter A: ");
        A = input.nextInt();
        System.out.println("Enter B: ");
        B = input.nextInt();

        System.out.println("Choose number of the option:");
        System.out.println("1. +");
        System.out.println("2. -");
        System.out.println("3. *");
        System.out.println("4. /");
        String s = input.next();

        switch (s){
            case "1":
                System.out.println(Sum(A, B));
                break;
            case "2":
                System.out.println(Sub(A, B));
                break;
            case "3":
                System.out.println(Mult(A, B));
                break;
            case "4":
                System.out.println(Divide(A, B));
                break;
            default:
                System.out.println("Error!");
                break;
        }
    }

    public int Sum(int a, int b) {
        return a + b;
    }

    public int Sub(int a, int b) {
        return a - b;
    }

    public int Mult(int a, int b) {
        return a * b;
    }

    public double Divide(int a, int b) {
        return a / b;
    }
}
