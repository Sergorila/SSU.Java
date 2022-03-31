package com.ssu.sergey_sidorov.java.lesson2.task2.Entities;

import com.ssu.sergey_sidorov.java.lesson2.task2.TransportException.FuelConsumptionException;
import com.ssu.sergey_sidorov.java.lesson2.task2.TransportException.VelocityTransportException;

public class Bus extends MiniBus {
    public Bus(String brand, String model, String busID,
               double fuelConsumption, double velocity) throws VelocityTransportException, FuelConsumptionException {
        super(brand, model, busID, fuelConsumption, velocity);
        this.maxPassengers = 25;
        this.doors = 2;
        this.price = 200000;
    }
}
