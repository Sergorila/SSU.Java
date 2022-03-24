package com.ssu.sergey_sidorov.java.lesson2.task2;

import com.ssu.sergey_sidorov.java.lesson2.task2.AutoPark.TransportStation;
import com.ssu.sergey_sidorov.java.lesson2.task2.Entities.Transport;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        TransportStation station = new TransportStation("src/com/ssu/sergey_sidorov/java/lesson2/task2/AutoPark/CarValues.txt");

        Transport[] busPool = station.getBusPool();

        double poolPrice = 0.0;
        for (var bus : busPool){
            poolPrice += bus.getPrice();
        }
        System.out.println("Cost of all buses: " + Math.round(poolPrice*100)/100.0 );

        sort(busPool);

        for (var car: busPool) {
            System.out.printf("FuelConsumption of %s: %s", car, car.getFuelConsumption());

            System.out.println();
        }


        System.out.println("\n Найти автобус в компании, соответствующий заданному диапазону параметров");

        System.out.println("Какой должна быть минимальная скорость автобуса?" );
        double minVelocity = getVelocity();


        System.out.println("Какой должна быть максимальная скорость автобуса?" );
        double maxVelocity = getVelocity();

        while (maxVelocity < minVelocity) {
            System.out.println("Указанное Вами значение меньше минимальной, \n" +
                    "укажите другое");
            maxVelocity = getVelocity();
        }

        for (Transport car : busPool) {
            if (car.getVelocity() >= minVelocity && car.getVelocity() <= maxVelocity) {
                System.out.printf("Speed of %s: %s", car, car.getVelocity());
                System.out.println();
            }


        }
    }

    private static double getVelocity() throws IOException {
        double currentVelocity;

        while (true) {
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                currentVelocity = Double.parseDouble(reader.readLine());
                break;
            }
            catch (NumberFormatException e){
                System.out.println("Введите число");
            }
        }
        return currentVelocity;
    }

    private static void sort(Transport[] arr) {
        for(int i = 1; i < arr.length; i++) {

            int j = i;
            Transport elem = arr[i];

            while( j > 0 && arr[j-1].getFuelConsumption() < elem.getFuelConsumption()) {
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = elem;
        }
    }
}
