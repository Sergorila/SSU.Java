package com.ssu.sergey_sidorov.java.lesson2.task2.Entities;

public class Bus extends MiniBus {
    public Bus(String brand, String model, String busID,
               double fuelConsumption, double velocity) {
        super(brand, model, busID, fuelConsumption, velocity);
        this.maxPassengers = 25;
        this.doors = 2;
        this.price = 200000;
    }
}
