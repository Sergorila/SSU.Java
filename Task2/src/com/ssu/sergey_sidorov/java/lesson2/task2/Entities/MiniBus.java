package com.ssu.sergey_sidorov.java.lesson2.task2.Entities;

import com.ssu.sergey_sidorov.java.lesson2.task2.TransportException.FuelConsumptionException;
import com.ssu.sergey_sidorov.java.lesson2.task2.TransportException.VelocityTransportException;

public class MiniBus extends Transport {
    public MiniBus(String brand, String model, String carID,
                   double fuelConsumption, double velocity) throws VelocityTransportException, FuelConsumptionException {
        this.brand = brand;
        this.model = model;
        this.busID = carID;
        if (fuelConsumption <= 0){
            throw new FuelConsumptionException("Fuel consumption must be > 0");
        }
        this.fuelConsumption = fuelConsumption;
        if (velocity <= 0){
            throw new VelocityTransportException("Velocity must be > 0");
        }
        if (velocity >= 350){
            throw new VelocityTransportException("This velocity is impossible for bus -_-");
        }
        this.velocity = velocity;
        this.maxPassengers = 10;
        this.doors = 1;
        this.price = 150000;
    }
}
