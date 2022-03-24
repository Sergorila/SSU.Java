package com.ssu.sergey_sidorov.java.lesson2.task2.AutoPark;

import com.ssu.sergey_sidorov.java.lesson2.task2.Entities.MiniBus;
import com.ssu.sergey_sidorov.java.lesson2.task2.Entities.Bus;
import com.ssu.sergey_sidorov.java.lesson2.task2.Entities.LongBus;
import com.ssu.sergey_sidorov.java.lesson2.task2.Entities.Transport;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TransportCreating {
    Transport[] createBuses(String fileAddress) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileAddress));
        Transport[] buses = new Transport[4];

        int i = 0;
        while (reader.ready()) {
            String[] carValues = reader.readLine().split(";");

            String brand = carValues[0];
            String model = carValues[1];
            String carID = carValues[2];
            double fuelConsumption = Double.parseDouble(carValues[3]);
            double velocity = Double.parseDouble(carValues[4]);
            int doors = Integer.parseInt(carValues[5]);

            Transport currentCar;

            if (doors == 1) {
                currentCar = new MiniBus(brand, model, carID,
                        fuelConsumption, velocity);
            } else {
                if (doors == 4) {
                    currentCar = new LongBus(brand, model, carID,
                            fuelConsumption, velocity);
                } else {
                    currentCar = new Bus(brand, model, carID,
                            fuelConsumption, velocity);
                }
            }

            buses[i] = currentCar;
            i++;
        }
        return buses;
    }
}

